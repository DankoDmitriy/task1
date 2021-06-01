package com.danko.customarray.validation;

//import org.junit.Test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomFileValidatorTest {

    @Test
    public void pisitivExistisFileValidation() {
        String puth = "test_data\\data.txt";
        boolean result = CustomFileValidator.isFileValidation(puth);
        assertTrue(result);
    }

    @Test
    public void negativExistisFileValidation() {
        String puth = "test_data\\data2.txt";
        boolean result = CustomFileValidator.isFileValidation(puth);
        assertFalse(result);
    }

    @Test
    public void negativPuthisFileValidation() {
        boolean result = CustomFileValidator.isFileValidation(null);
        assertFalse(result);
    }

    @Test
    public void positivIsFileisFileValidatio() {
        String puth = "test_data\\data.txt";
        boolean result = CustomFileValidator.isFileValidation(puth);
        assertTrue(result);
    }

    @Test
    public void negativIsFileisFileValidatio() {
        String puth = "test_data";
        boolean result = CustomFileValidator.isFileValidation(puth);
        assertFalse(result);
    }
}
