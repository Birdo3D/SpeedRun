package fr.birdo.speedrun.blocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PortalSupport {

    public static ItemStack getItemStackNether() {

        ItemStack portalSupport = new ItemStack(Material.NETHERITE_BLOCK);
        ItemMeta portalSupportM = portalSupport.getItemMeta();
        portalSupportM.setDisplayName("Nether Portal Support");
        portalSupport.setItemMeta(portalSupportM);

        return portalSupport;
    }

    public static ItemStack getItemStackEnder() {

        ItemStack portalSupport = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta portalSupportM = portalSupport.getItemMeta();
        portalSupportM.setDisplayName("Ender Portal Support");
        portalSupport.setItemMeta(portalSupportM);

        return portalSupport;
    }
}
