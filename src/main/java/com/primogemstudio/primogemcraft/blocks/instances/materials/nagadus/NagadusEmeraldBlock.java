package com.primogemstudio.primogemcraft.blocks.instances.materials.nagadus;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class NagadusEmeraldBlock extends Block {
    public NagadusEmeraldBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(3f, 15f));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }
}