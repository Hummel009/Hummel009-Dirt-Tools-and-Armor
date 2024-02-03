package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class DTAItemPickaxe extends ItemPickaxe {
	public DTAItemPickaxe(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
