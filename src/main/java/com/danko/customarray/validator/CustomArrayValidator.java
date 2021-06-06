package com.danko.customarray.validator;

import com.danko.customarray.entity.CustomArray;

public class CustomArrayValidator {
    public static boolean isCustomArrayValid(CustomArray array) {
        if (array == null || array.getLength() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
