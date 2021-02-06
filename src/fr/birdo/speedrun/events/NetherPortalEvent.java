package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class NetherPortalEvent implements Listener {

    public NetherPortalEvent(speedrun main) {
    }

    ItemStack NetherPortalSupport = fr.birdo.speedrun.blocks.NetherPortalSupport.getItemStack();

    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                    if (event.getPlayer().getInventory().getItemInMainHand() == new ItemStack(Material.OBSIDIAN)) {
                        if (event.getClickedBlock() != null) {
                            if (event.getClickedBlock() != NetherPortalSupport) {
                                event.getPlayer().sendMessage("Ce bloc doit être poser sur un support de portail");
                                event.setCancelled(true);
                            }
                        }
                    }
                }
            }
        }
    }
}
