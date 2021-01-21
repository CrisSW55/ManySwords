package crissw55.swordmod;

import crissw55.swordmod.recipes.ModRecipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SwordMod.MODID, name = SwordMod.NAME, version = SwordMod.VERSION)
public class SwordMod
{
    public static final String MODID = "swordmod";
    public static final String NAME = "Sword Mod";
    public static final String VERSION = "1.0";
    public static final CreativeTabs SWORD_TAB = new SwordModTab();

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
       ModRecipes.initSmelting();
    }
}
