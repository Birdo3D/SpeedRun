package fr.birdo.speedrun.blocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class NetherPortalSupport {

    public static ItemStack getItemStack() {

        ItemStack portalSupport = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta portalSupportM = portalSupport.getItemMeta();
        portalSupportM.setDisplayName("Nether Portal Support");
        portalSupportM.setLore(Arrays.asList("NetherPortalSupport"));
        portalSupport.setItemMeta(portalSupportM);

        return portalSupport;
    }
}
