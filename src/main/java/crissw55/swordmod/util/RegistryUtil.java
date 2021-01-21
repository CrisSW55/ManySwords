package crissw55.swordmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import crissw55.swordmod.SwordMod;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(SwordMod.MODID, name).setUnlocalizedName(SwordMod.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(SwordMod.MODID, name).setUnlocalizedName(SwordMod.MODID + "." + name);
        return block;
    }

}
