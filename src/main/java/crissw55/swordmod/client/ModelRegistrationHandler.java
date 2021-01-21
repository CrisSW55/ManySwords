package crissw55.swordmod.client;

import crissw55.swordmod.SwordMod;
import crissw55.swordmod.init.ModBlocks;
import crissw55.swordmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = SwordMod.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.AMETHYST,0);
        registerModel(ModItems.EMERALD_SWORD, 0);
        registerModel(ModItems.AMETHYST_SWORD,0);
        registerModel(ModItems.COAL_SWORD,0);
        registerModel(ModItems.REDSTONE_SWORD,0);
        registerModel(ModItems.LAPISLAZULI_SWORD,0);

        registerModel(Item.getItemFromBlock(ModBlocks.AMETHYST_OREBLOCK), 0);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }




}
