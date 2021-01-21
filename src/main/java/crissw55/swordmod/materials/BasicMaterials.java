package crissw55.swordmod.materials;

import crissw55.swordmod.SwordMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class BasicMaterials {

    public static final Item.ToolMaterial BASIC_TOOL = EnumHelper.addToolMaterial(SwordMod.MODID + ":" + "basic_tool", 2, 625, 7.0F, 2.5F, 10);
}
