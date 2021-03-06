package dev.vatuu.archiesarmy.registries;

import net.minecraft.util.registry.Registry;

import dev.vatuu.archiesarmy.entities.EnchanterEntity;
import dev.vatuu.archiesarmy.entities.spells.EnchantingSpell;
import dev.vatuu.archiesarmy.spells.Spell;
import dev.vatuu.archiesarmy.spells.SpellRegistry;

public class Spells {

    public static Spell<EnchanterEntity> ENCHANTING;

    public static void init() {
        ENCHANTING = Registry.register(SpellRegistry.REGISTRY, EnchantingSpell.ID, new EnchantingSpell());
    }
}
