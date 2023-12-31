package com.primogemstudio.primogemcraft.sounds;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftSounds {
    public static final SoundEvent PRE_GACHA = register("pre_gacha", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "pre_gacha")));
    public static final SoundEvent A_NEW_DAY_WITH_HOPE_RECORD = register("a_new_day_with_hope", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.a_new_day_with_hope")));
    public static final SoundEvent THE_FADING_STORIES = register("the_fading_stories", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.the_fading_stories")));
    public static final SoundEvent HAKUSHIN_LULLABY = register("hakushin_lullaby", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.hakushin_lullaby")));
    public static final SoundEvent VILLAGE_SURROUNDED_BY_GREEN = register("village_surrounded_by_green", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.village_surrounded_by_green")));
    public static final SoundEvent BALLAD_OF_MANY_WATERS = register("ballad_of_many_waters", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.ballad_of_many_waters")));
    public static final SoundEvent SPACE_WALK = register("space_walk", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.space_walk")));
    public static final SoundEvent SALTY_MOON = register("salty_moon", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.salty_moon")));
    public static final SoundEvent TAKE_THE_JOURNEY = register("take_the_journey", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.take_the_journey")));
    public static final SoundEvent MARCH_7TH_SOUND1 = register("march_7th_sound1", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "march_7th_sound1")));
    public static final SoundEvent MARCH_7TH_SOUND2 = register("march_7th_sound2", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "march_7th_sound2")));
    public static final SoundEvent MARCH_7TH_SOUND3 = register("march_7th_sound3", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "march_7th_sound3")));
    public static final SoundEvent GACHA_3STAR = register("gacha_3star", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "gacha_3star")));
    public static final SoundEvent GACHA_4STAR = register("gacha_4star", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "gacha_4star")));
    public static final SoundEvent GACHA_5STAR = register("gacha_5star", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "gacha_5star")));
    public static final SoundEvent NAGADUS_EMERALD_SHOVEL_ONUSE = register("nagadus_emerald_shovel_onuse", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "nagadus_emerald_shovel_onuse")));
    public static <T extends SoundEvent> T register(String name, T event) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(MOD_ID, name), event);
    }
}
