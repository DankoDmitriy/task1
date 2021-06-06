package com.danko.customarray.validation;

import com.danko.customarray.validator.CustomStringValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomStringValidatorTest {
    @Test
    public void positiveStringIsNull() {
        String str = null;
        boolean result = CustomStringValidator.stringVadidator(str);
        assertFalse(result);
    }

    @Test
    public void positiveStringLengthIsZero() {
        String str = "";
        boolean result = CustomStringValidator.stringVadidator(str);
        assertFalse(result);
    }

    @Test
    public void negativeStringIsNotCorrect() {
        String str = "12dsa 21ddas ,13";
        boolean result = CustomStringValidator.stringVadidator(str);
        assertFalse(result);
    }

    @Test
    public void positiveStringIsCorrect() {
        String str = "123 321 432";
        boolean result = CustomStringValidator.stringVadidator(str);
        assertTrue(result);
    }
}
