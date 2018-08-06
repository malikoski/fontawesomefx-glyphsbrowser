package de.jensd.fx.glyphs.browser;

import java.util.Optional;

/**
 * @author Ricardo
 */
public class ModuleUtil {

    public static final String MODULE_EMOJIONE            = "de.jensd.fx.glyphs.emojione";
    public static final String MODULE_COMMONS             = "de.jensd.fx.glyphs.commons";
    public static final String MODULE_FONTAWESOME         = "de.jensd.fx.glyphs.fontawesome";
    public static final String MODULE_ICONSFIVETWOFIVE    = "de.jensd.fx.glyphs.iconsfivetwofive";
    public static final String MODULE_MATERIALDESIGNICONS = "de.jensd.fx.glyphs.materialdesignicons";
    public static final String MODULE_MATERIALICONS       = "de.jensd.fx.glyphs.materialicons";
    public static final String MODULE_OCTICONS            = "de.jensd.fx.glyphs.octicons";
    public static final String MODULE_WEATHERICONS        = "de.jensd.fx.glyphs.weathericons";

    public static Optional<Module> getModule(String moduleName) {
        return ModuleLayer.boot().findModule(moduleName);
    }

    public static Module getModuleEmojiOne() {
        return getModule(MODULE_EMOJIONE).get();
    }

    public static Module getModuleCommons() {
        return getModule(MODULE_COMMONS).get();
    }

    public static Module getModuleFontAwesome() {
        return getModule(MODULE_FONTAWESOME).get();
    }

    public static Module getModuleIconsFiveTwoFive() {
        return getModule(MODULE_ICONSFIVETWOFIVE).get();
    }

    public static Module getModuleMaterialDesignIcons() {
        return getModule(MODULE_MATERIALDESIGNICONS).get();
    }

    public static Module getModuleMaterialIcons() {
        return getModule(MODULE_MATERIALICONS).get();
    }

    public static Module getModuleOcticons() {
        return getModule(MODULE_OCTICONS).get();
    }

    public static Module getModuleWeathericons() {
        return getModule(MODULE_WEATHERICONS).get();
    }

}
