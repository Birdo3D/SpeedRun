package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class LockedChestEvent implements Listener {

    public LockedChestEvent(speedrun main) {
    }

    ItemStack LockedChest1 = fr.birdo.speedrun.blocks.LockedChest.getItemStackChest1();
    ItemStack LockedChest2 = fr.birdo.speedrun.blocks.LockedChest.getItemStackChest2();
    ItemStack LockedChestKey1 = fr.birdo.speedrun.items.LockedChestKey.getItemStackKey1();
    ItemStack LockedChestKey2 = fr.birdo.speedrun.items.LockedChestKey.getItemStackKey2();

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getClickedBlock() != null) {
                    if (event.getClickedBlock() == LockedChest1) {
                        if (event.getPlayer().getInventory().getItemInMainHand() != LockedChestKey1) {
                            event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                        }
                    }
                    if (event.getClickedBlock() == LockedChest2) {
                        if (event.getPlayer().getInventory().getItemInMainHand() != LockedChestKey2) {
                            event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                        }
                    }
                }
            }
        }
    }
}
