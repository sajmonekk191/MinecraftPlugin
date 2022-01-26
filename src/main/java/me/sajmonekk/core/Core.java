package me.sajmonekk.core;

import me.sajmonekk.core.ConnectCore.JoinPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin implements Listener
{

    @Override
    public void onEnable()
    {
        PluginManager pm = new PluginManager()

        Bukkit.getLogger().info(ChatColor.DARK_RED + "|DarkCore|" + ChatColor.GREEN+" has been loaded successfully!");
        Bukkit.getPluginManager().registerEvents(new JoinPlugin, this);
        new plugman(this);
    }
    @Override
    public void onDisable()
    {
        Bukkit.getLogger().info(ChatColor.DARK_RED + "|DarkCore|" + ChatColor.RED + " has been unloaded successfully!");
    }
}
