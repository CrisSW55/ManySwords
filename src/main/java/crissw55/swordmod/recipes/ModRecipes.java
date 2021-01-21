package crissw55.swordmod.recipes;

import crissw55.swordmod.init.ModBlocks;
import crissw55.swordmod.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.registry.GameRegistry;



public class ModRecipes {

    public static void initSmelting() {
        GameRegistry.addSmelting(ModBlocks.AMETHYST_OREBLOCK, new ItemStack(ModItems.AMETHYST), 10.0F);
    }



}
