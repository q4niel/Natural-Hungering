package q4niel.hunger_fix.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Items.class)
public class ItemsMixin {
    private static final String METHOD = "<clinit>";
    private static final String VALUE = "INVOKE";
    private static final String ITEM_CONSTRUCTOR = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V";
    private static final String ALIASED_BLOCK_ITEM_CONSTRUCTOR = "Lnet/minecraft/item/AliasedBlockItem;<init>(Lnet/minecraft/block/Block;Lnet/minecraft/item/Item$Settings;)V";

    private static Item.Settings modifySettings(int ordinal, Item.Settings settings) {
        return switch (ordinal) {
            case GOLDEN_APPLE, ENCHANTED_GOLDEN_APPLE -> settings.maxCount(1);
            default -> settings.maxCount(16);
        };
    }

    //<editor-fold desc="AliasedBlockItem Constructor Ordinals">
    private static final int CARROT = 7;
    private static final int POTATO = 8;
    private static final int SWEET_BERRIES = 12;
    private static final int GLOW_BERRIES = 13;
    //</editor-fold>

    //<editor-fold desc="AliasedBlockItem Constructor Injections">
    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ALIASED_BLOCK_ITEM_CONSTRUCTOR, ordinal = CARROT), index = 1)
    private static Item.Settings carrot(Item.Settings settings) { return modifySettings(CARROT, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ALIASED_BLOCK_ITEM_CONSTRUCTOR, ordinal = POTATO), index = 1)
    private static Item.Settings potato(Item.Settings settings) { return modifySettings(POTATO, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ALIASED_BLOCK_ITEM_CONSTRUCTOR, ordinal = SWEET_BERRIES), index = 1)
    private static Item.Settings sweetBerries(Item.Settings settings) { return modifySettings(SWEET_BERRIES, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ALIASED_BLOCK_ITEM_CONSTRUCTOR, ordinal = GLOW_BERRIES), index = 1)
    private static Item.Settings glowBerries(Item.Settings settings) { return modifySettings(GLOW_BERRIES, settings); }
    //</editor-fold>

    //<editor-fold desc="Item Constructor Ordinals">
    private static final int APPLE = 3;
    private static final int BREAD = 24;
    private static final int PORKCHOP = 26;
    private static final int COOKED_PORKCHOP = 27;
    private static final int GOLDEN_APPLE = 28;
    private static final int ENCHANTED_GOLDEN_APPLE = 29;
    private static final int COD = 38;
    private static final int SALMON = 39;
    private static final int TROPICAL_FISH = 40;
    private static final int PUFFERFISH = 41;
    private static final int COOKED_COD = 42;
    private static final int COOKED_SALMON = 43;
    private static final int COOKIE = 46;
    private static final int MELON_SLICE = 47;
    private static final int DRIED_KELP = 48;
    private static final int BEEF = 49;
    private static final int COOKED_BEEF = 50;
    private static final int CHICKEN = 51;
    private static final int COOKED_CHICKEN = 52;
    private static final int ROTTEN_FLESH = 53;
    private static final int BAKED_POTATO = 62;
    private static final int POISONOUS_POTATO = 63;
    private static final int GOLDEN_CARROT = 64;
    private static final int PUMPKIN_PIE = 66;
    private static final int RABBIT = 70;
    private static final int COOKED_RABBIT = 71;
    private static final int MUTTON = 75;
    private static final int COOKED_MUTTON = 76;
    private static final int BEETROOT = 78;
    //</editor-fold>

    //<editor-fold desc="Item Constructor Injections">
    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = APPLE))
    private static Item.Settings apple(Item.Settings settings) { return modifySettings(APPLE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = BREAD))
    private static Item.Settings bread(Item.Settings settings) { return modifySettings(BREAD, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = PORKCHOP))
    private static Item.Settings porkchop(Item.Settings settings) { return modifySettings(PORKCHOP, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_PORKCHOP))
    private static Item.Settings cookedPorkchop(Item.Settings settings) { return modifySettings(COOKED_PORKCHOP, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = GOLDEN_APPLE))
    private static Item.Settings goldenApple(Item.Settings settings) { return modifySettings(GOLDEN_APPLE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = ENCHANTED_GOLDEN_APPLE))
    private static Item.Settings enchantedGoldenApple(Item.Settings settings) { return modifySettings(ENCHANTED_GOLDEN_APPLE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COD))
    private static Item.Settings cod(Item.Settings settings) { return modifySettings(COD, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = SALMON))
    private static Item.Settings salmon(Item.Settings settings) { return modifySettings(SALMON, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = TROPICAL_FISH))
    private static Item.Settings tropicalFish(Item.Settings settings) { return modifySettings(TROPICAL_FISH, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = PUFFERFISH))
    private static Item.Settings pufferfish(Item.Settings settings) { return modifySettings(PUFFERFISH, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_COD))
    private static Item.Settings cookedCod(Item.Settings settings) { return modifySettings(COOKED_COD, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_SALMON))
    private static Item.Settings cookedSalmon(Item.Settings settings) { return modifySettings(COOKED_SALMON, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKIE))
    private static Item.Settings cookie(Item.Settings settings) { return modifySettings(COOKIE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = MELON_SLICE))
    private static Item.Settings melonSlice(Item.Settings settings) { return modifySettings(MELON_SLICE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = DRIED_KELP))
    private static Item.Settings driedKelp(Item.Settings settings) { return modifySettings(DRIED_KELP, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = BEEF))
    private static Item.Settings beef(Item.Settings settings) { return modifySettings(BEEF, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_BEEF))
    private static Item.Settings cookedBeef(Item.Settings settings) { return modifySettings(COOKED_BEEF, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = CHICKEN))
    private static Item.Settings chicken(Item.Settings settings) { return modifySettings(CHICKEN, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_CHICKEN))
    private static Item.Settings cookedChicken(Item.Settings settings) { return modifySettings(COOKED_CHICKEN, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = ROTTEN_FLESH))
    private static Item.Settings rottenFlesh(Item.Settings settings) { return modifySettings(ROTTEN_FLESH, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = BAKED_POTATO))
    private static Item.Settings bakedPotato(Item.Settings settings) { return modifySettings(BAKED_POTATO, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = POISONOUS_POTATO))
    private static Item.Settings poisonousPotato(Item.Settings settings) { return modifySettings(POISONOUS_POTATO, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = GOLDEN_CARROT))
    private static Item.Settings goldenCarrot(Item.Settings settings) { return modifySettings(GOLDEN_CARROT, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = PUMPKIN_PIE))
    private static Item.Settings pumpkinPie(Item.Settings settings) { return modifySettings(PUMPKIN_PIE, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = RABBIT))
    private static Item.Settings rabbit(Item.Settings settings) { return modifySettings(RABBIT, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_RABBIT))
    private static Item.Settings cookedRabbit(Item.Settings settings) { return modifySettings(COOKED_RABBIT, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = MUTTON))
    private static Item.Settings mutton(Item.Settings settings) { return modifySettings(MUTTON, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = COOKED_MUTTON))
    private static Item.Settings cookedMutton(Item.Settings settings) { return modifySettings(COOKED_MUTTON, settings); }

    @ModifyArg(method = METHOD, at = @At(value = VALUE, target = ITEM_CONSTRUCTOR, ordinal = BEETROOT))
    private static Item.Settings beetroot(Item.Settings settings) { return modifySettings(BEETROOT, settings); }
    //</editor-fold>
}