package com.danko.customarray.validator;

import java.io.File;

public class CustomFileValidator {
    public static boolean isFileValidation(String fileAddress) {
        if (fileAddress == null) {
            return false;
        }
        File file = new File(fileAddress);
        if (file.exists() && file.canRead() && file.isFile() && file.length() > 0) {
            return true;
        }
        return false;
    }
}
