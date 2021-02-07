package fr.birdo.speedrun.blocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LockedChest {

    public static ItemStack getItemStackChest1() {

        ItemStack chest = new ItemStack(Material.TRAPPED_CHEST);
        ItemMeta chestM = chest.getItemMeta();
        chestM.setDisplayName("Coffre vérouillé 1");
        chest.setItemMeta(chestM);

        return chest;
    }

    public static ItemStack getItemStackChest2() {

        ItemStack chest = new ItemStack(Material.ENDER_CHEST);
        ItemMeta chestM = chest.getItemMeta();
        chestM.setDisplayName("Coffre vérouillé 2");
        chest.setItemMeta(chestM);

        return chest;
    }
}