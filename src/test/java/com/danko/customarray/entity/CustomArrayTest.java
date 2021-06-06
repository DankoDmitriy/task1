package com.danko.customarray.entity;

import com.danko.customarray.exception.CustomArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class CustomArrayTest {
    @Test(groups = "CustomArrayException")
    public void testCustomArrayConstructor() {
        assertThrows(CustomArrayException.class, () -> new CustomArray(null));
    }
}
