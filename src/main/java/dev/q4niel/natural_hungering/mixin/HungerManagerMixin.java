package dev.q4niel.natural_hungering.mixin;

import dev.q4niel.natural_hungering.NaturalHungering;
import net.minecraft.entity.player.HungerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HungerManager.class)
public class HungerManagerMixin {
    HungerManager self = (HungerManager)(Object)this;
    @Shadow private float exhaustion;

    @Inject (
            method = "update(Lnet/minecraft/server/network/ServerPlayerEntity;)V",
            at = @At("HEAD")
    )
    void update(CallbackInfo ci) {
        self.addExhaustion(NaturalHungering.PASSIVE_EXHAUSTION);
    }

    @Inject (
            method = "addExhaustion(F)V",
            at = @At("HEAD"),
            cancellable = true
    )
    void addExhaustion(float exhaustion, CallbackInfo ci) {
        this.exhaustion = (this.exhaustion + (exhaustion / NaturalHungering.EXHAUSTION_DIVIDER));
    }
}