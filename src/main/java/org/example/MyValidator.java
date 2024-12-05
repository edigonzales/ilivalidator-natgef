package org.example;

import org.interlis2.validator.Validator;
import ch.ehi.basics.settings.Settings;

public class MyValidator {
    
    public boolean run(String xtfFile) {
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_META_CONFIGFILE, "ilidata:SO_AFU_Naturgefahren_20240515-web-meta");
        
        boolean valid = Validator.runValidation(xtfFile, settings);
        return valid;
    }
}
