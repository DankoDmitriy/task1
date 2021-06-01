package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.impl.CustomArraySortsServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

//import org.junit.Test;

public class CustomArraySortsServiceImplTest {

    public static CustomArray ACTUAL_CUSTOM_ARRAY;
    public static CustomArray ACTUAL_CUSTOM_ARRAY_TEST;

    static {
        try {
            ACTUAL_CUSTOM_ARRAY = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            ACTUAL_CUSTOM_ARRAY_TEST = new CustomArray(0, 1, 3, 2, 5, 4, 6, 7, 8, 9);
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "mainGroup", priority = 4)
    public void positiveBubbleSort() throws Exception {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.bubbleSort(ACTUAL_CUSTOM_ARRAY_TEST);
        assertArrayEquals(ACTUAL_CUSTOM_ARRAY.getArray(), expected.getArray());
    }

    @Test(groups = "CustomArrayException", priority = 9)
    public void positiveCustomArrayIsNullBubbleSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.bubbleSort(null));
    }

    @Test(groups = "CustomArrayException", priority = 10)
    public void positiveCustomArrayIsEmptyBubbleSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.bubbleSort(testMas));

    }

    @Test
    public void positiveInsertsSort() throws Exception {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.insertsSort(ACTUAL_CUSTOM_ARRAY_TEST);
        assertArrayEquals(ACTUAL_CUSTOM_ARRAY.getArray(), expected.getArray());
    }

    @Test(groups = "CustomArrayException", priority = 11)
    public void positiveCustomArrayIsNullInsertsSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.insertsSort(null));
    }

    @Test(groups = "CustomArrayException", priority = 12)
    public void positiveCustomArrayIsEmptyInsertsSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.insertsSort(testMas));

    }

    @Test
    public void positiveSelectionSort() throws Exception {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.selectionSort(ACTUAL_CUSTOM_ARRAY_TEST);
        assertArrayEquals(ACTUAL_CUSTOM_ARRAY.getArray(), expected.getArray());
    }

    @Test(groups = "CustomArrayException", priority = 13)
    public void positiveCustomArrayIsNullSelectionSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.selectionSort(null));
    }

    @Test(groups = "CustomArrayException", priority = 14)
    public void positiveCustomArrayIsEmptySelectionSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.selectionSort(testMas));

    }
}
