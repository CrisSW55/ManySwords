package crissw55.swordmod;

import crissw55.swordmod.init.ModBlocks;
import crissw55.swordmod.item.ItemBasicSword;
import crissw55.swordmod.materials.BasicMaterials;
import crissw55.swordmod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = SwordMod.MODID)
public class RegistrationHandler {



        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] items = {
                    RegistryUtil.setItemName(new Item(),"amethyst").setCreativeTab(SwordMod.SWORD_TAB),

                    RegistryUtil.setItemName(new ItemBasicSword(BasicMaterials.BASIC_TOOL), "emerald_sword").setCreativeTab(SwordMod.SWORD_TAB),
                    RegistryUtil.setItemName(new ItemBasicSword(BasicMaterials.BASIC_TOOL), "amethyst_sword").setCreativeTab(SwordMod.SWORD_TAB),
                    RegistryUtil.setItemName(new ItemBasicSword(BasicMaterials.BASIC_TOOL), "coal_sword").setCreativeTab(SwordMod.SWORD_TAB),
                    RegistryUtil.setItemName(new ItemBasicSword(BasicMaterials.BASIC_TOOL), "redstone_sword").setCreativeTab(SwordMod.SWORD_TAB),
                    RegistryUtil.setItemName(new ItemBasicSword(BasicMaterials.BASIC_TOOL), "lapislazuli_sword").setCreativeTab(SwordMod.SWORD_TAB),

            };

            final Item[] itemBlocks = {
                    new ItemBlock(ModBlocks.AMETHYST_OREBLOCK).setRegistryName(ModBlocks.AMETHYST_OREBLOCK.getRegistryName())
            };

            event.getRegistry().registerAll(items);
           event.getRegistry().registerAll(itemBlocks);
        }

        @SubscribeEvent
        public static void registerBlocks(Register<Block> event) {
            final Block[] blocks = {
                    RegistryUtil.setBlockName(new Block(Material.ROCK), "amethyst_oreblock").setCreativeTab(SwordMod.SWORD_TAB)
            };

            event.getRegistry().registerAll(blocks);
        }

    }

