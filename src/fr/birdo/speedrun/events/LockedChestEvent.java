package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LockedChestEvent implements Listener {

    public LockedChestEvent(speedrun main) {
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {

        if (event.getAction() != null) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getClickedBlock() != null) {
                    if (event.getClickedBlock().getType() == Material.TRAPPED_CHEST) {
                        if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.TRIPWIRE_HOOK) {
                                if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta() && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasDisplayName() && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("Key for Chest 1")) {
                                    //event.setCancelled(false);
                                } else {
                                    event.setCancelled(true);
                                    event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                                }
                            } else {
                                event.setCancelled(true);
                                event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                            }
                        } else {
                            event.setCancelled(true);
                            event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                        }
                    }

                    if (event.getClickedBlock().getType() == Material.ENDER_CHEST) {
                        if (event.getPlayer().getInventory().getItemInMainHand() != null) {
                            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.TRIPWIRE_HOOK) {
                                if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta() && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasDisplayName() && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("Key for Chest 2")) {
                                    //event.setCancelled(false);
                                } else {
                                    event.setCancelled(true);
                                    event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                                }
                            } else {
                                event.setCancelled(true);
                                event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                            }
                        } else {
                            event.setCancelled(true);
                            event.getPlayer().sendMessage(ChatColor.RED+"Vous n'avez pas la clef nécessaire pour ouvrir ce coffre");
                        }
                    }
                }
            }
        }
    }
}
