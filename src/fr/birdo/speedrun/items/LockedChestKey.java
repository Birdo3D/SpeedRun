package fr.birdo.speedrun.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LockedChestKey {

    public static ItemStack getItemStackKey1() {

        ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK);
        ItemMeta keyM = key.getItemMeta();
        keyM.setDisplayName("Key for Chest 1");
        key.setItemMeta(keyM);

        return key;
    }

    public static ItemStack getItemStackKey2() {

        ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK);
        ItemMeta keyM = key.getItemMeta();
        keyM.setDisplayName("Key for Chest 2");
        key.setItemMeta(keyM);

        return key;
    }
}
