package com.danko.customarray.validation;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.validator.CustomArrayValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomArrayValidatorTest {
    @Test
    public void testNegativeIsCustomArrayValid() {
        CustomArray customArray = new CustomArray();
        boolean result = CustomArrayValidator.isCustomArrayValid(customArray);
        assertFalse(result);
    }

    @Test
    public void testPositiveIsCustomArrayValid() throws Exception {
        int[] array = new int[]{1, 6, 2, 5, 3, 4, 7, 9, 8, 0};
        CustomArray customArray = new CustomArray(array);
        boolean result = CustomArrayValidator.isCustomArrayValid(customArray);
        assertTrue(result);
    }
}
