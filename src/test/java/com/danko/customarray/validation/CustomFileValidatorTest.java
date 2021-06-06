package com.danko.customarray.validation;

import com.danko.customarray.validator.CustomFileValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomFileValidatorTest {

    @Test
    public void positiveExistIsFileValidation() {
        String path = "test_data\\data.txt";
        boolean result = CustomFileValidator.isFileValidation(path);
        assertTrue(result);
    }

    @Test
    public void negativeExistIsFileValidation() {
        String path = "test_data\\data2.txt";
        boolean result = CustomFileValidator.isFileValidation(path);
        assertFalse(result);
    }

    @Test
    public void negativePathIsFileValidation() {
        boolean result = CustomFileValidator.isFileValidation(null);
        assertFalse(result);
    }

    @Test
    public void positiveIsFileIsFileValidation() {
        String path = "test_data\\data.txt";
        boolean result = CustomFileValidator.isFileValidation(path);
        assertTrue(result);
    }

    @Test
    public void negativeIsFileIsFileValidation() {
        String path = "test_data";
        boolean result = CustomFileValidator.isFileValidation(path);
        assertFalse(result);
    }
}
