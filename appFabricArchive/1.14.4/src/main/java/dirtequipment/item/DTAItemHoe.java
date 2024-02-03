package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, 0.0f, new Settings().group(ItemGroup.TOOLS));
	}
}