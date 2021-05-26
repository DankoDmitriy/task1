package com.danko.customarray.entity;

import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.parser.Parser;
import org.junit.Test;

import static org.testng.Assert.assertThrows;

public class CustomArrayTest {
    @Test
    public void testCustomArrayConstructor() {
        assertThrows(CustomArrayException.class, () -> new CustomArray(null));
    }
}
