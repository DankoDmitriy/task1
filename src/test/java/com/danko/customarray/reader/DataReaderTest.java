package com.danko.customarray.reader;

import com.danko.customarray.exception.CustomArrayException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class DataReaderTest {
    @Test
    public void positiveGetCorrectArray() throws Exception {
        ArrayList<String> actual = new ArrayList<>(Arrays.asList("123 111 3321 123"));
        String puth = "test_data\\data.txt";
        DataReader dataReader = new DataReader();
        ArrayList<String> expected = dataReader.reader(puth);
        assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void negativeFileIsNotCorrect() {
        String puth = "test_data\\data2.txt";
        DataReader dataReader = new DataReader();
        assertThrows(RuntimeException.class, () -> dataReader.reader(puth));
    }
}
