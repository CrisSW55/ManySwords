package crissw55.swordmod;

import crissw55.swordmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SwordModTab  extends CreativeTabs{
        public SwordModTab() {
            super(SwordMod.MODID);
        }


        //	@Override
//	public ItemStack createIcon() {
//		return new ItemStack(ModItems.FIRST_ITEM);
//	}
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.REDSTONE_SWORD);
        }
}


