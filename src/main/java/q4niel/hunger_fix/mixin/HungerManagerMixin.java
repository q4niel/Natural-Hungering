package q4niel.hunger_fix.mixin;

import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HungerManager.class)
public class HungerManagerMixin {
    @Inject (
            method = "update(Lnet/minecraft/entity/player/PlayerEntity;)V",
            at = @At("HEAD")
    )
    void update(PlayerEntity player, CallbackInfo ci) {
        ((HungerManager)(Object)this).addExhaustion(0.003f);
    }
}