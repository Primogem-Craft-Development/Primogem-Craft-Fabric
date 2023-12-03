package com.primogemstudio.primogemcraft.interfaces;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public interface BlockExtension {
    void onDestroyedByPlayer(Level level, Player player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack tool);
}
