package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemHoe;

public class DTAItemHoe extends ItemHoe {
	public DTAItemHoe(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}