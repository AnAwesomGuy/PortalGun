package net.anawesomguy.portalgun.neo;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

import static net.anawesomguy.portalgun.PortalGun.MOD_ID;

@Mod(MOD_ID)
@EventBusSubscriber
public final class PortalGunImpl {
    @SubscribeEvent
    public static void register(RegisterEvent register) {
    }
}
