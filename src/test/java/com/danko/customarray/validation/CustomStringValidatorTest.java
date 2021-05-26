package com.danko.customarray.validation;

import org.junit.Test;

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
    public void negativStrigIsNotCorrect(){
        String str = "12dsa 21ddas ,13";
        boolean result = CustomStringValidator.stringVadidator(str);
        assertFalse(result);
    }

    @Test
    public void positiveStrigIsCorrect(){
        String str = "123 321 432";
        boolean result = CustomStringValidator.stringVadidator(str);
        assertTrue(result);
    }


}
