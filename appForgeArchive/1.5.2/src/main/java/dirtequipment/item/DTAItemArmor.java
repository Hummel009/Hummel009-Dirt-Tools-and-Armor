package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DTAItemArmor extends ItemArmor {
	public DTAItemArmor(int id, int slot) {
		super(id, DTAArmorMaterials.DIRT, slot == 2 ? 2 : 1, slot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, int layer) {
		return "/textures/models/armor/dirt_layer_" + (slot == 2 ? 2 : 1) + ".png";
	}
}
