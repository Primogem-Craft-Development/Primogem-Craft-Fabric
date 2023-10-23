package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static final String MOD_ID = "primogemcraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        PrimogemCraftBlocks.init();
        PrimogemCraftItems.init();
        PrimogemCraftEntities.init();
        PrimogemCraftSounds.init();
        CreativeTabs.init();
        LOGGER.info("Primogem Craft Loaded");
    }
}
