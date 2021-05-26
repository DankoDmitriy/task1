package com.danko.customarray.parser;

import com.danko.customarray.exception.CustomArrayException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ParserTest {
    @Test
    public void negativeInputArrayStringIsNull() {
        Parser parser = new Parser();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(null));
    }

    @Test
    public void negativeInputArrayStringSizeIsNull() {
        Parser parser = new Parser();
        ArrayList<String> arrayList = new ArrayList<>();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(arrayList));
    }

    @Test
    public void negativeInputArrayCantHaveCorrectInformation() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("asd32 efs312 fdsd", "asdvg 32 fdsdf3 dsf"));
        Parser parser = new Parser();
        assertThrows(CustomArrayException.class, () -> parser.parserStringToIntString(arrayList));
    }

    @Test
    public void positiveGetCorrectArray() throws Exception {
        Parser parser = new Parser();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("1 22 333"));
        int[] actual = {1, 22, 333};
        int[] expected = parser.parserStringToIntString(arrayList);
        assertArrayEquals(actual, expected);
    }
}
