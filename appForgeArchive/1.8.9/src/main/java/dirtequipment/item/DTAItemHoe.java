package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class DTAItemHoe extends ItemHoe {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}