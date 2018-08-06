package de.jensd.fx.glyphs.browser;

/**
 * Resolve fontinfo.properties by Module
 *
 * @author Ricardo Malikoski
 */
public enum ModuleFontInfoProperties {

    FONTAWESOME_PROPERTIES(ModuleUtil.MODULE_FONTAWESOME, "/de/jensd/fx/glyphs/fontawesome/fontinfo.properties"),
    ICONS525_PROPERTIES(ModuleUtil.MODULE_ICONSFIVETWOFIVE,"/de/jensd/fx/glyphs/icons525/fontinfo.properties"),
    MATERIALDESIGNFONT_PROPERTIES(ModuleUtil.MODULE_MATERIALDESIGNICONS,"/de/jensd/fx/glyphs/materialdesignicons/fontinfo.properties"),
    MATERIALICONS_PROPERTIES(ModuleUtil.MODULE_MATERIALICONS,"/de/jensd/fx/glyphs/materialicons/fontinfo.properties"),
    OCTICONS_PROPERTIES(ModuleUtil.MODULE_OCTICONS,"/de/jensd/fx/glyphs/octicons/fontinfo.properties"),
    WEATHERICONS_PROPERTIES(ModuleUtil.MODULE_WEATHERICONS,"/de/jensd/fx/glyphs/weathericons/fontinfo.properties"),
    EMOJIONE_PROPERTIES(ModuleUtil.MODULE_EMOJIONE,"/de/jensd/fx/glyphs/emojione/fontinfo.properties"),

    ;

    private final String moduleName;
    private final String urlFontInfoProperties;

    ModuleFontInfoProperties(String moduleName, String urlFontInfoProperties) {
        this.moduleName = moduleName;
        this.urlFontInfoProperties = urlFontInfoProperties;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getUrlFontInfoProperties() {
        return urlFontInfoProperties;
    }

}
