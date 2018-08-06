import java.util.spi.AbstractResourceBundleProvider;

/**
 * @author Ricardo Malikoski
 */module fontawesomefx.glyphsbrowser {

    requires javafx.base;
    requires javafx.controls;
    requires java.logging;
    requires javafx.fxml;
    requires controlsfx;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.emojione;
    requires de.jensd.fx.glyphs.fontawesome;
    requires de.jensd.fx.glyphs.iconsfivetwofive;
    requires de.jensd.fx.glyphs.materialdesignicons;
    requires de.jensd.fx.glyphs.materialicons;
    requires de.jensd.fx.glyphs.octicons;
    requires de.jensd.fx.glyphs.weathericons;

    exports de.jensd.fx.glyphs.browser;
    exports de.jensd.fx.glyphs.browser.spi;

    opens de.jensd.fx.glyphs.browser;

    uses de.jensd.fx.glyphs.browser.spi.TranslationsProvider;

    provides de.jensd.fx.glyphs.browser.spi.TranslationsProvider with de.jensd.fx.glyphs.browser.DefaultTranslationsProvider;

}