package dirtequipment;

import dirtequipment.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("dirtequipment")
public class DTA {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "dirtequipment");

	public static final RegistryObject<Item> DIRT_SWORD = ITEMS.register("dirt_sword", DTAItemSword::new);

	public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new DTAItemArmor(EquipmentSlot.HEAD));
	public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new DTAItemArmor(EquipmentSlot.CHEST));
	public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new DTAItemArmor(EquipmentSlot.LEGS));
	public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new DTAItemArmor(EquipmentSlot.FEET));

	public static final RegistryObject<Item> DIRT_SHOVEL = ITEMS.register("dirt_shovel", DTAItemShovel::new);
	public static final RegistryObject<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", DTAItemPickaxe::new);
	public static final RegistryObject<Item> DIRT_AXE = ITEMS.register("dirt_axe", DTAItemAxe::new);
	public static final RegistryObject<Item> DIRT_HOE = ITEMS.register("dirt_hoe", DTAItemHoe::new);

	public DTA() {
		var fmlBus = FMLJavaModLoadingContext.get().getModEventBus();
		ITEMS.register(fmlBus);
	}
}
