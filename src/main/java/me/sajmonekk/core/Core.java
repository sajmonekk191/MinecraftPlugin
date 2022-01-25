package me.sajmonekk.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        System.out.println(ChatColor.GREEN + " has been Enabled !");
        Bukkit.getServer().getPluginManager().registerEvents(new JoinPlugin(), this);
    }
    @Override
    public void onDisable()
    {
        System.out.println(ChatColor.GREEN + " has been Disabled !");
    }
}
