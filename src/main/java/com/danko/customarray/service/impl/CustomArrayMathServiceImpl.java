package com.danko.customarray.service.impl;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.CustomArrayMathService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayMathServiceImpl implements CustomArrayMathService {
    private static Logger logger = LogManager.getLogger();
    private final int FIRST_ELEMENT_INDEX = 0;

    @Override
    public int findMinElement(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        int result = array.getElementByIndex(FIRST_ELEMENT_INDEX);
        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElementByIndex(i) < result) {
                result = array.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "Has been found min element. min = " + result);
        return result;
    }

    @Override
    public int findMaxElement(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        int result = array.getElementByIndex(FIRST_ELEMENT_INDEX);
        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElementByIndex(i) > result) {
                result = array.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "Has been found max element. max = " + result);
        return result;
    }

    @Override
    public double calculateArithmeticMean(CustomArray array) throws CustomArrayException {
//        here need to add exceptions to an NULL array and array size = 0.
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        double sumArray = calculateSum(array);
        double result = sumArray / array.getLength();
        return result;
    }

    @Override
    public int calculateSum(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        int sumArray = 0;
        for (int i = 0; i < array.getLength(); i++) {
            sumArray += array.getElementByIndex(i);
        }
        return sumArray;
    }

    @Override
    public int countQuantityPositiveElements(CustomArray array) throws CustomArrayException {
//        here need to add exceptions to an NULL array and array size = 0.
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        int result = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElementByIndex(i) > 0) {
                result++;
            }
        }
        return result;
    }

    @Override
    public int countQuantityNegativeElements(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        int result = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElementByIndex(i) < 0) {
                result++;
            }
        }
        return result;
    }
}
