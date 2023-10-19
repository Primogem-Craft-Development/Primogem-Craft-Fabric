package com.primogemstudio.primogemcraft.items.instances;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DendroPickaxe extends PickaxeItem {
    public DendroPickaxe() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public @NotNull Ingredient getRepairIngredient() {
                // TODO item addition -> PrimogemcraftModItems.SHENGZHANGBIFEISUIXIE
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entity) {
        boolean ret = super.mineBlock(stack, world, state, pos, entity);
        // TODO item addition -> PrimogemcraftModItems.CAOYUANHE
        /*BlockPos pos = new BlockPos((int) entity.getX(), (int) entity.getY(), (int) entity.getZ());
        if (Math.random() < 0.1 && ((world.getBlockState(pos)).getBlock() == Blocks.WATER
                || (world.getBlockState()).getBlock() == Blocks.WATER || (world.getBlockState(pos)).getBlock() == Blocks.BUBBLE_COLUMN)) {
            if (world.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(PrimogemcraftModItems.CAOYUANHE.get()));
                entityToSpawn.setPickUpDelay(10);
                world.addFreshEntity(entityToSpawn);
            }
        }*/

        return ret;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);
        tooltipComponents.add(Component.translatable("tooltip.primogemcraft.dendro_pickaxe.line1"));
        tooltipComponents.add(Component.translatable("tooltip.primogemcraft.dendro_pickaxe.line2"));
    }
}