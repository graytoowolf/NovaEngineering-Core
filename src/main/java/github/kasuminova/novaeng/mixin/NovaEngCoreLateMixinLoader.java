package github.kasuminova.novaeng.mixin;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class NovaEngCoreLateMixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Arrays.asList(
                "mixins.novaeng_core_ae.json",
                "mixins.novaeng_core_astralsorcery.json",
                "mixins.novaeng_core_eio.json",
                "mixins.novaeng_core_igi.json",
                "mixins.novaeng_core_mekanism.json",
                "mixins.novaeng_core_nco.json",
                "mixins.novaeng_core_oreexcavation.json",
                "mixins.novaeng_core_rgb_chat.json",
                "mixins.novaeng_core_techguns.json"
        );
    }

    @Override
    public boolean shouldMixinConfigQueue(final String mixinConfig) {
        return switch (mixinConfig) {
            case "mixins.novaeng_core_ae.json" -> Loader.isModLoaded("appliedenergistics2");
            case "mixins.novaeng_core_astralsorcery.json" -> Loader.isModLoaded("astralsorcery");
            case "mixins.novaeng_core_eio.json" -> Loader.isModLoaded("enderioconduits");
            case "mixins.novaeng_core_igi.json" -> Loader.isModLoaded("ingameinfoxml");
            case "mixins.novaeng_core_mekanism.json" -> Loader.isModLoaded("mekanism");
            case "mixins.novaeng_core_nco.json" -> Loader.isModLoaded("nuclearcraft");
            case "mixins.novaeng_core_oreexcavation.json" -> Loader.isModLoaded("oreexcavation");
            case "mixins.novaeng_core_rgb_chat.json" -> Loader.isModLoaded("jianghun");
            case "mixins.novaeng_core_techguns.json" -> Loader.isModLoaded("techguns");
            default -> true;
        };
    }

    public static boolean isCleanroomLoader() {
        try {
            Class.forName("com.cleanroommc.boot.Main");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
