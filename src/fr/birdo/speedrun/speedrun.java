package fr.birdo.speedrun;

import fr.birdo.speedrun.events.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class speedrun extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"[SpeedRun] Plugin activé !");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new EndPortalEvent(this), this);
        pm.registerEvents(new NetherPortalEvent(this), this);
        pm.registerEvents(new LockedChestEvent(this), this);
        pm.registerEvents(new GiveCommandEvent(this), this);
        pm.registerEvents(new PortalSupportEvent(this), this);
    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"[SpeedRun] Plugin désactivé !");
    }
}
