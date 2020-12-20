package dev.vatuu.archiesarmy;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import dev.vatuu.archiesarmy.network.NetworkHandler;
import dev.vatuu.archiesarmy.registries.Entities;
import dev.vatuu.archiesarmy.registries.Items;
import dev.vatuu.archiesarmy.registries.Spells;
import dev.vatuu.archiesarmy.spells.SpellRegistry;

public class ArchiesArmy implements ModInitializer {

    public static final String MOD_ID = "archiesarmy";
    public static ArchiesArmy INSTANCE;

    public NetworkHandler networkHandler;

    @Override
    @SuppressWarnings("unchecked")
    public void onInitialize() {
        INSTANCE = this;
        Entities.registerEntityAttributes();
        Registry.register((Registry<Registry<?>>)Registry.REGISTRIES, SpellRegistry.REGISTRY_KEY.getValue(), SpellRegistry.REGISTRY);
        Spells.init();
        networkHandler = new NetworkHandler();
        Items.init();
    }

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }
}
