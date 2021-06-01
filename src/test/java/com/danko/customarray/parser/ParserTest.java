package com.danko.customarray.parser;

import com.danko.customarray.exception.CustomArrayException;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

//import org.junit.Test;

public class ParserTest {
    public static final int[] ACTUAL = {1, 22, 333};

    @Test(groups = {"NullAndEmpty"}, priority = 1)
    public void negativeInputArrayStringIsNull() {
        Parser parser = new Parser();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(null));
    }

    @Test(groups = "CustomArrayException", priority = 2)
    public void negativeInputArrayStringSizeIsNull() {
        Parser parser = new Parser();
        ArrayList<String> arrayList = new ArrayList<>();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(arrayList));
    }

    @Test(groups = "CustomArrayException",priority = 3)
    public void negativeInputArrayCantHaveCorrectInformation() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("asd32 efs312 fdsd", "asdvg 32 fdsdf3 dsf"));
        Parser parser = new Parser();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(arrayList));
    }

    @Test(groups = "mainGroup", priority = 1)
    public void positiveGetCorrectArray() throws Exception {
        Parser parser = new Parser();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("1 22 333"));
        int[] expected = parser.parserStringToIntString(arrayList);
        assertArrayEquals(ACTUAL, expected);
    }
}
