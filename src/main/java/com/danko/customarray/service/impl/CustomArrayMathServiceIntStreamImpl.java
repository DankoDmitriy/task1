package com.danko.customarray.service.impl;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.CustomArrayMathService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CustomArrayMathServiceIntStreamImpl implements CustomArrayMathService {
    private static Logger logger = LogManager.getLogger();
    private final int FIRST_ELEMENT_INDEX = 0;

    @Override
    public int findMinElement(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        OptionalInt result = intStream.min();
        logger.log(Level.INFO, "Has been found min element. min = " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public int findMaxElement(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        OptionalInt result = intStream.max();
        logger.log(Level.INFO, "Has been found min element. max = " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public double calculateArithmeticMean(CustomArray array) throws CustomArrayException {
        OptionalDouble result = Arrays.stream(array.getArray()).average();
        return result.getAsDouble();
    }

    @Override
    public int calculateSum(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        int result = intStream.sum();
        logger.log(Level.INFO, "Has been found min element. min = " + result);
        return result;
    }

    @Override
    public int countQuantityPositiveElements(CustomArray array) throws CustomArrayException {
        return 0;
    }

    @Override
    public int countQuantityNegativeElements(CustomArray array) throws CustomArrayException {
        return 0;
    }
}
