
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class SzhjsjItem extends Item {
	public SzhjsjItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u53EF\u5728\u953B\u9020\u53F0\u5347\u7EA7\u4E0B\u754C\u5408\u91D1\u8D28\u88C5\u5907"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u53EF\u5E94\u7528\u4E8E\uFF1A"));
		list.add(new TextComponent("\u00A79 \u4E0B\u754C\u5408\u91D1\u5251"));
		list.add(new TextComponent("\u00A79 \u4E0B\u754C\u5408\u91D1\u5236\u76D4\u7532"));
	}
}
