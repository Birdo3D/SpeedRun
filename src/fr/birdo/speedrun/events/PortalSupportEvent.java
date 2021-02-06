package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PortalSupportEvent implements Listener {

    public PortalSupportEvent(speedrun main) {
    }

    ItemStack NetherPortalSupport = fr.birdo.speedrun.blocks.NetherPortalSupport.getItemStack();
    ItemStack EnderPortalSupport = fr.birdo.speedrun.blocks.EndPortalSupport.getItemStack();

    public void onBreak(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
                if (event.getClickedBlock() != null) {
                    if (event.getClickedBlock() == NetherPortalSupport || event.getClickedBlock() == EnderPortalSupport) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
