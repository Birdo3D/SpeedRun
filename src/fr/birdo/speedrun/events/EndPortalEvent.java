package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class EndPortalEvent implements Listener {

    public EndPortalEvent(speedrun main) {
    }

    ItemStack EnderPortalSupport = fr.birdo.speedrun.blocks.EndPortalSupport.getItemStack();

    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                    if (event.getPlayer().getInventory().getItemInMainHand() == new ItemStack(Material.END_PORTAL)) {
                        if (event.getClickedBlock() != null) {
                            if (event.getClickedBlock() != EnderPortalSupport) {
                                event.getPlayer().sendMessage("Ce bloc doit être poser sur un support de portail");
                                event.setCancelled(true);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onBreak(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
                if (event.getClickedBlock() != null) {
                    if (event.getClickedBlock() == new ItemStack(Material.END_PORTAL)) {
                        event.getPlayer().getInventory().addItem(new ItemStack(Material.END_PORTAL));
                        event.getClickedBlock().getLocation().getBlock().setType(Material.AIR);
                    }
                }
            }
        }
    }
}
