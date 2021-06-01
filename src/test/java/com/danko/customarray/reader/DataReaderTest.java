package com.danko.customarray.reader;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

//import org.junit.Test;

public class DataReaderTest {
    public final static String CORRECT_PATH = "test_data\\data.txt";
    public final static String NOT_CORRECT_PATH = "test_data\\data2.txt";

    @Test(groups = "mainGroup")
    public void positiveGetCorrectArray() throws Exception {
        ArrayList<String> actual = new ArrayList<>(Arrays.asList("123 111 3321 123"));
        DataReader dataReader = new DataReader();
        ArrayList<String> expected = dataReader.reader(CORRECT_PATH);
        assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test(groups = "CustomArrayException", priority = 4)
    public void negativeFileIsNotCorrect() {
        DataReader dataReader = new DataReader();
        assertThrows(RuntimeException.class, () -> dataReader.reader(NOT_CORRECT_PATH));
    }
}
