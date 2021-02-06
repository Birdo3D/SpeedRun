package fr.birdo.speedrun.events;

import fr.birdo.speedrun.speedrun;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.ItemStack;

public class GiveCommandEvent implements Listener {

    public GiveCommandEvent(speedrun main) {
    }

    ItemStack LockedChest1 = fr.birdo.speedrun.blocks.LockedChest.getItemStackChest1();
    ItemStack LockedChest2 = fr.birdo.speedrun.blocks.LockedChest.getItemStackChest2();
    ItemStack LockedChestKey1 = fr.birdo.speedrun.items.LockedChestKey.getItemStackKey1();
    ItemStack LockedChestKey2 = fr.birdo.speedrun.items.LockedChestKey.getItemStackKey2();

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {

        Player p = e.getPlayer();
        String msg = e.getMessage();
        String[] args = msg.split(" ");

        if (args[0].equalsIgnoreCase("/give")) {
            if (p.getGameMode() == GameMode.CREATIVE) {
                if (args[1].equalsIgnoreCase("plugin:LockedChest")) {
                    if(args[2].equalsIgnoreCase("1")){
                        p.getInventory().addItem(LockedChest1);
                        e.setCancelled(true);
                    }
                    if(args[2].equalsIgnoreCase("2")){
                        p.getInventory().addItem(LockedChest2);
                        e.setCancelled(true);
                    }
                }
                if (args[1].equalsIgnoreCase("plugin:LockedChestKey")) {
                    if(args[2].equalsIgnoreCase("1")){
                        p.getInventory().addItem(LockedChestKey1);
                        e.setCancelled(true);
                    }
                    if(args[2].equalsIgnoreCase("2")){
                        p.getInventory().addItem(LockedChestKey2);
                        e.setCancelled(true);
                    }
                }
            }
        }
    }

}
