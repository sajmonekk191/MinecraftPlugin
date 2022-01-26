package me.sajmonekk.core.ConnectCore;

import me.sajmonekk.core.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinPlugin implements CommandExecutor
{
    public plugman(Core plugin)
    {
        plugin.getCommand("discord").setExecutor(this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player p = event.getPlayer();
        if(p instanceof Player)
        {
            if(p.isOp())
            {
                Bukkit.broadcastMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
                p.sendMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
            }
            else
            {
                Bukkit.broadcastMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
                p.sendMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
            }
        }
    }
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event)
    {
        Player p = event.getPlayer();
        if(p instanceof Player)
        {
            if(p.isOp())
            {
                Bukkit.broadcastMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se odpojil.");
                p.sendMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.RED + " se odpojil.");
            }
            else
            {
                Bukkit.broadcastMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se odpojil.");
                p.sendMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.RED + " se odpojil.");
            }
        }
    }

    @Override
    public boolean onCommand(CommandSender sender,Command cmd,String label, String[] args)
    {
        sender.sendMessage("------------------------------------");
        sender.sendMessage(ChatColor.DARK_AQUA + "Připoj se na náš disocrd server:" + ChatColor.GOLD + " ZDE");
        sender.sendMessage("------------------------------------");
        return true;
    }
}
