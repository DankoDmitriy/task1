package com.danko.customarray.validation;

import com.danko.customarray.entity.CustomArray;
import org.junit.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

//import org.testng.annotations.Test;

public class CustomArrayValidatorTest {
    @Test
    public void testNegativIsCustomArrayValid() {
        CustomArray customArray = new CustomArray();
        boolean result = CustomArrayValidator.isCustomArrayValid(customArray);
        assertFalse(result);
    }

    @Test
    public void testPositivIsCustomArrayValid() throws Exception {
        int[] array = new int[]{1, 6, 2, 5, 3, 4, 7, 9, 8, 0};
        CustomArray customArray = new CustomArray(array);
        boolean result = CustomArrayValidator.isCustomArrayValid(customArray);
        assertTrue(result);
    }
}
