package fr.birdo.speedrun;

import fr.birdo.speedrun.blocks.LockedChest;
import fr.birdo.speedrun.events.EndPortalEvent;
import fr.birdo.speedrun.events.GiveCommandEvent;
import fr.birdo.speedrun.events.LockedChestEvent;
import fr.birdo.speedrun.events.NetherPortalEvent;
import fr.birdo.speedrun.items.LockedChestKey;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class speedrun extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"[SpeedRun] Plugin activé !");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new LockedChest(this), this);
        pm.registerEvents(new LockedChestKey(this), this);
        pm.registerEvents(new EndPortalEvent(this), this);
        pm.registerEvents(new NetherPortalEvent(this), this);
        pm.registerEvents(new LockedChestEvent(this), this);
        pm.registerEvents(new GiveCommandEvent(this), this);
    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"[SpeedRun] Plugin désactivé !");
    }
}
