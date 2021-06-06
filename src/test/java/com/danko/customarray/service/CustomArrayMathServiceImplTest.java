package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.impl.CustomArrayMathServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CustomArrayMathServiceImplTest {
    public static CustomArray ACTUAL_CUSTOM_ARRAY;
    public final static int ACTUAL_MIN_ELEMENT = 0;
    public final static int ACTUAL_MAX_ELEMENT = 9;
    public final static double ACTUAL_MEAN_VALUE = 4.5;
    public final static int ACTUAL_SUM = 45;
    public final static int ACTUAL_POSITIVE_ELEMENTS_COUNT = 9;
    public final static int ACTUAL_NEGATIVE_ELEMENTS_COUNT = 0;

    static {
        try {
            ACTUAL_CUSTOM_ARRAY = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "mainGroup", priority = 3)
    public void positiveFindMinElementTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        int expected = customArrayMathService.findMinElement(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_MIN_ELEMENT, expected);
    }

    @Test(groups = "CustomArrayException", priority = 5)
    public void positiveCustomArrayIsNullFindMinElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(null));
    }

    @Test(groups = "CustomArrayException", priority = 6)
    public void positiveCustomArrayIsEmptyFindMinElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(testMas));
    }

    @Test
    public void positiveFindMaxElementTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        int expected = customArrayMathService.findMaxElement(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_MAX_ELEMENT, expected);
    }

    @Test(groups = "CustomArrayException", priority = 7)
    public void positiveCustomArrayIsNullFindMaxElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMaxElement(null));
    }

    @Test(groups = "CustomArrayException", priority = 8)
    public void positiveCustomArrayIsEmptyFindMaxElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(testMas));
    }

    @Test
    public void positiveCalculateArithmeticMeanTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        double expected = customArrayMathService.calculateArithmeticMean(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_MEAN_VALUE, expected);
    }

    @Test
    public void positiveCustomArrayIsNullCalculateArithmeticMeanTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.calculateArithmeticMean(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyCalculateArithmeticMeanTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.calculateArithmeticMean(testMas));
    }

    @Test
    public void positiveCalculateSumTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        int expected = customArrayMathService.calculateSum(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_SUM, expected);
    }

    @Test
    public void positiveCustomArrayIsNullCalculateSumTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.calculateSum(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyCalculateSumTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.calculateSum(testMas));
    }

    @Test
    public void positiveCountQuantityPositiveElementsTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        int expected = customArrayMathService.countQuantityPositiveElements(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_POSITIVE_ELEMENTS_COUNT, expected);
    }

    @Test
    public void positiveCustomArrayIsNullCountQuantityPositiveElementsTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.countQuantityPositiveElements(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyCountQuantityPositiveElementsTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.countQuantityPositiveElements(testMas));
    }

    @Test
    public void positiveCountQuantityNegativeElementsTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        int expected = customArrayMathService.countQuantityNegativeElements(ACTUAL_CUSTOM_ARRAY);
        assertEquals(ACTUAL_NEGATIVE_ELEMENTS_COUNT, expected);
    }

    @Test
    public void positiveCustomArrayIsNullCountQuantityNegativeElementsTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.countQuantityNegativeElements(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyCountQuantityNegativeElementsTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.countQuantityNegativeElements(testMas));
    }

}
