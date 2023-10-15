
package net.mcreator.ceshi.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Zsqsx2Procedure;
import net.mcreator.ceshi.procedures.ZskjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public abstract class ZszstItem extends ArmorItem {
	public ZszstItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 117;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 6, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.ZUISHENGSUIXIE.get()), new ItemStack(Items.DIAMOND));
			}

			@Override
			public String getName() {
				return "zszst";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ZszstItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A75\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u300E\u52FE\u7389\u300F\u72B6\u6001\u4E0B\u83B7\u5F97\u9AD8\u989D\u6297\u6027\u63D0\u5347"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u96E8\u6216\u96F7\u96E8\u5929\u83B7\u5F97\u529B\u91CF \u901F\u5EA6"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zszst__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZskjsxProcedure.execute(world, entity, itemstack);
		}
	}

	public static class Chestplate extends ZszstItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A75\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u300E\u52FE\u7389\u300F\u72B6\u6001\u4E0B\u83B7\u5F97\u9AD8\u989D\u6297\u6027\u63D0\u5347"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u96E8\u6216\u96F7\u96E8\u5929\u83B7\u5F97\u529B\u91CF \u901F\u5EA6"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zszst__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Zsqsx2Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		}
	}

	public static class Leggings extends ZszstItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A75\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u300E\u52FE\u7389\u300F\u72B6\u6001\u4E0B\u83B7\u5F97\u9AD8\u989D\u6297\u6027\u63D0\u5347"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u96E8\u6216\u96F7\u96E8\u5929\u83B7\u5F97\u529B\u91CF \u901F\u5EA6"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zszst__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZskjsxProcedure.execute(world, entity, itemstack);
		}
	}

	public static class Boots extends ZszstItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("\u00A75\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A77 - 2\u5957\u88C5\uFF1A\u300E\u52FE\u7389\u300F\u72B6\u6001\u4E0B\u83B7\u5F97\u9AD8\u989D\u6297\u6027\u63D0\u5347"));
			list.add(new TextComponent("\u00A77 - 4\u5957\u88C5\uFF1A\u96E8\u6216\u96F7\u96E8\u5929\u83B7\u5F97\u529B\u91CF \u901F\u5EA6"));
			list.add(new TextComponent("\u00A7"));
			list.add(new TextComponent("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zszst__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZskjsxProcedure.execute(world, entity, itemstack);
		}
	}
}
