package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class IntertwinedFate extends BowItem implements Vanishable {
    public IntertwinedFate() {
        super(new Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    @NotNull
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        //TODO
        return super.finishUsingItem(stack, level, livingEntity);
    }
}
