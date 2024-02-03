package dirtequipment.material;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum DTAArmorMaterials implements ArmorMaterial {
	DIRT("dirt", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0F, 0, Ingredient.of(Items.DIRT));

	private static final int[] DURABILITY_FOR_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] defenseForSlot;
	private final int enchantmentValue;
	private final SoundEvent equipSound;
	private final float toughness;
	private final Ingredient repairIngredient;
	private final float knockbackResistance;

	DTAArmorMaterials(String name, int durabilityMultiplier, int[] defenseForSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.defenseForSlot = defenseForSlot;
		this.enchantmentValue = enchantmentValue;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return defenseForSlot[slot.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return DURABILITY_FOR_SLOT[slot.getIndex()] * durabilityMultiplier;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return equipSound;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}
