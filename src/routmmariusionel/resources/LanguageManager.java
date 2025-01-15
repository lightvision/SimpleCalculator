/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routmmariusionel.resources;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @author Marius
 */
public class LanguageManager {

    private static ResourceBundle bundle;

    public static void setLanguage(String languageCode) {

        try {
            Locale locale = new Locale(languageCode);
            bundle = ResourceBundle.getBundle("routmmariusionel.resources.messages", locale);

        } catch (MissingResourceException e) {
            System.err.println("Eroare: Nu am găsit fișierul de resurse pentru limba: " + languageCode);
//        e.printStackTrace(); // Opțional: afișează stack trace-ul pentru debugging
        }
    }

    public static String getString(String key, boolean returnNullIfNotExists) {
        if (bundle.containsKey(key)) {
            return bundle.getString(key);
        }
        return returnNullIfNotExists ? null : key;
    }
}
