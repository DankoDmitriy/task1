package com.danko.customarray.service.impl;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.CustomArrayMathService;
import com.danko.customarray.validator.CustomArrayValidator;
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
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value search is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value search is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        OptionalInt result = intStream.min();
        logger.log(Level.INFO, "Has been found min element. min = " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public int findMaxElement(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value search is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value search is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        OptionalInt result = intStream.max();
        logger.log(Level.INFO, "Has been found min element. max = " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public double calculateArithmeticMean(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value calculate is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value calculate is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        OptionalDouble result = Arrays.stream(array.getArray()).average();
        return result.getAsDouble();
    }

    @Override
    public int calculateSum(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value calculate is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value calculate is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        int result = intStream.sum();
        logger.log(Level.INFO, "Has been found min element. min = " + result);
        return result;
    }

    @Override
    public int countQuantityPositiveElements(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value count is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value count is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        int result = (int) intStream.filter(var -> var > 0).count();
        return result;
    }

    @Override
    public int countQuantityNegativeElements(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            logger.log(Level.INFO, "Input CustomArray is empty or null. Value count is not possible.");
            throw new CustomArrayException("Input CustomArray is empty or null. Value count is not possible.");
        }
        logger.log(Level.DEBUG, "Input CustomArray: " + array);
        IntStream intStream = Arrays.stream(array.getArray());
        int result = (int) intStream.filter(var -> var < 0).count();
        return result;
    }
}
