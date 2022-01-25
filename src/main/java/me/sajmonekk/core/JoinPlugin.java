package me.sajmonekk.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinPlugin implements Listener
{
    public void onPlayerJoin(CommandSender sender, PlayerJoinEvent event)
    {
        if(sender.isOp())
        {
            //Bukkit.broadcastMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
            sender.sendMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
        }
        else
        {
            //Bukkit.broadcastMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
            sender.sendMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se připojil.");
        }
    }
    public void onPlayerLeave(CommandSender sender, PlayerQuitEvent event)
    {
        if(sender.isOp())
        {
            //Bukkit.broadcastMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.GREEN + " se odpojil.");
            sender.sendMessage(ChatColor.DARK_RED + event.getPlayer().getName() + ChatColor.RED + " se odpojil.");
        }
        else
        {
            //Bukkit.broadcastMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + " se odpojil.");
            sender.sendMessage(ChatColor.WHITE + event.getPlayer().getName() + ChatColor.RED + " se odpojil.");
        }
    }
}
