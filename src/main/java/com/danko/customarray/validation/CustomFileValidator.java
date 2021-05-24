package com.danko.customarray.validation;

import java.io.File;

public class CustomFileValidator {
    public static boolean isFileValidation(String fileAddress) {
        File file = new File(fileAddress);
        if (file.exists() && file.canRead() && file.isFile() && file.length() > 0) {
            return true;
        }
        return false;
    }
}
