package de.jensd.fx.glyphs.browser;

import de.jensd.fx.glyphs.browser.spi.TranslationsProvider;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.AbstractResourceBundleProvider;

/**
 * @author Ricardo
 */
public class DefaultTranslationsProvider extends AbstractResourceBundleProvider
        implements TranslationsProvider {

    private static Locale ENGLISH = Locale.ENGLISH;

    @Override
    public String toBundleName(String baseName, Locale locale) {
        String bundleName = super.toBundleName(baseName, locale);
        if (ENGLISH.equals(locale)) {
            int index = bundleName.lastIndexOf('.');
            return bundleName.substring(0, index + 1) + "en" + bundleName.substring(index);
        }
        return bundleName;
    }

    @Override
    public ResourceBundle getBundle(String baseName, Locale locale) {
        if (ENGLISH.equals(locale)) {
            return super.getBundle(baseName, locale);
        }
        return null;
    }


}


