package fr.birdo.speedrun.blocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class EndPortalSupport {

    public static ItemStack getItemStack() {

        ItemStack portalSupport = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta portalSupportM = portalSupport.getItemMeta();
        portalSupportM.setDisplayName("Ender Portal Support");
        portalSupportM.setLore(Arrays.asList("EnderPortalSupport"));
        portalSupport.setItemMeta(portalSupportM);

        return portalSupport;
    }
}
