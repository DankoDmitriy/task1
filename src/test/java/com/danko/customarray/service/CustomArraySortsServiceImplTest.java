package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.impl.CustomArraySortsServiceImpl;
import org.junit.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class CustomArraySortsServiceImplTest {

    @Test
    public void positiveBubbleSort() throws Exception {
        CustomArray actual = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        CustomArray testMas = new CustomArray(0, 1, 3, 2, 5, 4, 6, 7, 8, 9);

        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.bubbleSort(testMas);
        assertArrayEquals(actual.getArray(), expected.getArray());
    }

    @Test
    public void positiveCustomArrayIsNullBubbleSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.bubbleSort(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyBubbleSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.bubbleSort(testMas));

    }

    @Test
    public void positiveInsertsSort() throws Exception {
        CustomArray actual = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        CustomArray testMas = new CustomArray(0, 1, 3, 2, 5, 4, 6, 7, 8, 9);

        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.insertsSort(testMas);
        assertArrayEquals(actual.getArray(), expected.getArray());
    }

    @Test
    public void positiveCustomArrayIsNullInsertsSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.insertsSort(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyInsertsSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.insertsSort(testMas));

    }

    @Test
    public void positiveSelectionSort() throws Exception {
        CustomArray actual = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        CustomArray testMas = new CustomArray(0, 1, 3, 2, 5, 4, 6, 7, 8, 9);

        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray expected = customArraySortsService.selectionSort(testMas);
        assertArrayEquals(actual.getArray(), expected.getArray());
    }

    @Test
    public void positiveCustomArrayIsNullSelectionSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.selectionSort(null));
    }

    @Test
    public void positiveCustomArrayIsEmptySelectionSort() {
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArraySortsService.selectionSort(testMas));

    }
}
