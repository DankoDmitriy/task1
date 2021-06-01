package com.danko.customarray.maker;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CustomArrayMakerTest {
    @Test(groups = "mainGroup", priority = 2)
    public void testMakerCustomArray() throws CustomArrayException {
        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        CustomArrayMaker customArrayMaker = new CustomArrayMaker();
        CustomArray expected = customArrayMaker.makerCustomArray(actual);
        assertEquals(actual, expected.getArray());
    }
}
