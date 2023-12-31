package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VayudaTurquoiseGemstoneAxeItem extends AxeItem {
    public VayudaTurquoiseGemstoneAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 9.5f;
            }

            public float getAttackDamageBonus() {
                return 6.5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM), new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_axe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_axe.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_axe.line3"));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        var player = (Player) entity;
        if (selected) {
            if (entity.isInWaterOrBubble()) {
                if (!player.hasEffect(MobEffects.DOLPHINS_GRACE)) {
                    player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 240, 1, false, false));
                    if (itemstack.hurt(Mth.nextInt(RandomSource.create(), 4, 8), RandomSource.create(), null)) {
                        itemstack.shrink(1);
                        itemstack.setDamageValue(0);
                    }
                }
            } else {
                if (!player.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 240, 1, false, false));
                    if (itemstack.hurt(4, RandomSource.create(), null)) {
                        itemstack.shrink(1);
                        itemstack.setDamageValue(0);
                    }
                }
            }
        }
    }
}