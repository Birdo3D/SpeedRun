package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PortalSupportEvent implements Listener {

    public PortalSupportEvent(speedrun main) {
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (event.getBlock() != null) {
            if (event.getBlock().getType() == Material.NETHERITE_BLOCK || event.getBlock().getType() == Material.DIAMOND_BLOCK) {
                if(event.getPlayer().getGameMode() != GameMode.CREATIVE) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(ChatColor.RED+"Tu ne peux pas casser les support de portail");
                }
            }
        }
    }
}
