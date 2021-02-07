package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class NetherPortalEvent implements Listener {

    public NetherPortalEvent(speedrun main) {
    }

    @EventHandler
    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                    if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.OBSIDIAN) {
                        if (event.getClickedBlock() != null) {
                            if (event.getClickedBlock().getType() != Material.NETHERITE_BLOCK) {
                                event.getPlayer().sendMessage(ChatColor.RED+"Ce bloc doit être poser sur un support de portail");
                                event.setCancelled(true);
                            }
                        }
                    }
                }
            }
        }
    }
}
