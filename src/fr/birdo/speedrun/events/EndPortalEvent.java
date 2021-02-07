package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class EndPortalEvent implements Listener {

    public EndPortalEvent(speedrun main) {
    }

    @EventHandler
    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                    if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.END_PORTAL_FRAME) {
                        if (event.getClickedBlock() != null) {
                            if (event.getClickedBlock().getType() != Material.DIAMOND_BLOCK) {
                                event.getPlayer().sendMessage(ChatColor.RED + "Ce bloc doit être poser sur un support de portail");
                                event.setCancelled(true);
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onBreak(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
                if (event.getClickedBlock() != null) {
                    if (event.getClickedBlock().getType() == Material.END_PORTAL_FRAME) {
                        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
                            event.getPlayer().getInventory().addItem(new ItemStack(Material.END_PORTAL_FRAME));
                            event.getClickedBlock().getLocation().getBlock().setType(Material.AIR);
                        }
                    }
                }
            }
        }
    }
}
