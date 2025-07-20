package top.cfti.betterenchantnames.mixin.client;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import top.cfti.betterenchantnames.EnchantmentHelper;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    
    @Inject(method = "getName", at = @At("RETURN"), cancellable = true)
    private static void enhanceEnchantmentName(RegistryEntry<Enchantment> enchantment, int level, CallbackInfoReturnable<Text> cir) {
        Text originalName = cir.getReturnValue();
        Text enhancedName = EnchantmentHelper.createEnhancedName(originalName, enchantment, level);
        cir.setReturnValue(enhancedName);
    }
}