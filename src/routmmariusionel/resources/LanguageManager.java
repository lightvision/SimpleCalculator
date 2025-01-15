/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routmmariusionel.resources;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Marius
 */
public class LanguageManager {
    private static ResourceBundle bundle;
    
    public static void setLanguage(String languageCode){
        Locale locale=new Locale(languageCode);
        
        bundle=ResourceBundle.getBundle("resources.messages", locale);
        System.out.println(locale);
        System.exit(0);
        
        
        
    }
    
    public static String getString(String key, boolean returnNullIfNotExists) {
        if (bundle.containsKey(key)) {
            return bundle.getString(key);
        }
        return returnNullIfNotExists ? null : key;
    }
}
