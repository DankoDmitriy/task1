package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.impl.CustomArrayMathServiceImpl;
import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CustomArrayMathServiceImplTest {

    @Test
    public void positiveFindMinElementTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray(1, 22, 333);
        int actual = 1;
        int expected = customArrayMathService.findMinElement(testMas);
        assertEquals(actual, expected);
    }

    @Test
    public void positiveCustomArrayIsNullFindMinElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyFindMinElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(testMas));

    }

    @Test
    public void positiveFindMaxElementTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray(1, 22, 333);
        int actual = 333;
        int expected = customArrayMathService.findMaxElement(testMas);
        assertEquals(actual, expected);
    }

    @Test
    public void positiveCustomArrayIsNullFindMaxElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMaxElement(null));
    }

    @Test
    public void positiveCustomArrayIsEmptyFindMaxElementTest() {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray();
        assertThrows(CustomArrayException.class, () -> customArrayMathService.findMinElement(testMas));

    }


    @Test
    public void positiveCalculateArithmeticMeanTest() throws CustomArrayException {
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArray testMas = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        double actual = 4.5;
        double expected = customArrayMathService.calculateArithmeticMean(testMas);
        assertEquals(actual, expected);
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
        CustomArray testMas = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int actual = 45;
        int expected = customArrayMathService.calculateSum(testMas);
        assertEquals(actual, expected);
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
        CustomArray testMas = new CustomArray(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int actual = 9;
        int expected = customArrayMathService.countQuantityPositiveElements(testMas);
        assertEquals(actual, expected);
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
        CustomArray testMas = new CustomArray(0, 1, -2, 3, 4, -5, 6, -7, 8, 9);
        int actual = 3;
        int expected = customArrayMathService.countQuantityNegativeElements(testMas);
        assertEquals(actual, expected);
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
