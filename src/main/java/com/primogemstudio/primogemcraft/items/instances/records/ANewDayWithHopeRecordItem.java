package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class ANewDayWithHopeRecordItem extends RecordItem {
    public ANewDayWithHopeRecordItem() {
        super(15, PrimogemCraftSounds.A_NEW_DAY_WITH_HOPE_RECORD, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 103);
    }
}
