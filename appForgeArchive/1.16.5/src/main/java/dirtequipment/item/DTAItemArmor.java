package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(EquipmentSlotType slotType) {
		super(DTAArmorMaterials.DIRT, slotType, new Properties().tab(ItemGroup.TAB_COMBAT));
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlotType slotType, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (slotType == EquipmentSlotType.LEGS ? 2 : 1) + ".png";
	}
}