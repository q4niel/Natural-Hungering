package q4niel.hunger_fix.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Items.class)
public class ItemsMixin {
    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 3
            )
    )
    private static Item.Settings apple(Item.Settings settings) {
        return settings.maxCount(16);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 28
            )
    )
    private static Item.Settings goldenApple(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 29
            )
    )
    private static Item.Settings enchantedGoldenApple(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 64
            )
    )
    private static Item.Settings goldenCarrot(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 62
            )
    )
    private static Item.Settings bakedPotato(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 49
            )
    )
    private static Item.Settings beef(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 50
            )
    )
    private static Item.Settings cookedBeef(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 26
            )
    )
    private static Item.Settings porkchop(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 27
            )
    )
    private static Item.Settings cookedPorkchop(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 75
            )
    )
    private static Item.Settings mutton(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 76
            )
    )
    private static Item.Settings cookedMutton(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 51
            )
    )
    private static Item.Settings chicken(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 52
            )
    )
    private static Item.Settings cookedChicken(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 70
            )
    )
    private static Item.Settings rabbit(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 71
            )
    )
    private static Item.Settings cookedRabbit(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 38
            )
    )
    private static Item.Settings cod(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 42
            )
    )
    private static Item.Settings cookedCod(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 39
            )
    )
    private static Item.Settings salmon(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 43
            )
    )
    private static Item.Settings cookedSalmon(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 40
            )
    )
    private static Item.Settings tropicalFish(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 41
            )
    )
    private static Item.Settings pufferfish(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 24
            )
    )
    private static Item.Settings bread(Item.Settings settings) {
        return settings.maxCount(1);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 46
            )
    )
    private static Item.Settings cookie(Item.Settings settings) {
        return settings.maxCount(16);
    }

    @ModifyArg (
            method = "<clinit>",
            at = @At (
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V",
                    ordinal = 66
            )
    )
    private static Item.Settings pumpkinPie(Item.Settings settings) {
        return settings.maxCount(1);
    }
}