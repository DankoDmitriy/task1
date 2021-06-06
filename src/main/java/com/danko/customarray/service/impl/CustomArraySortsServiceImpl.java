package com.danko.customarray.service.impl;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.service.CustomArraySortsService;
import com.danko.customarray.validator.CustomArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySortsServiceImpl implements CustomArraySortsService {
    public static Logger logger = LogManager.getLogger();

    @Override
    public CustomArray bubbleSort(CustomArray array) throws CustomArrayException {
        if (!CustomArrayValidator.isCustomArrayValid(array)) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input array in bubbleSort: " + array);
        for (int i = 0; i < array.getLength(); i++) {
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getElementByIndex(i) > array.getElementByIndex(j)) {
                    int tmp = array.getElementByIndex(i);
                    array.setElementByIndex(i, array.getElementByIndex(j));
                    array.setElementByIndex(j, tmp);
                }
            }
        }
        logger.log(Level.INFO, "Array has been sorted by bubbleSort. Result: " + array);
        return array;
    }

    @Override
    public CustomArray insertsSort(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input array in insertsSort: " + array);
        for (int i = 0; i < array.getLength() - 1; i++) {
            int j = i + 1;
            int element = array.getElementByIndex(j);
            for (; j > 0; j--) {
                if (element < array.getElementByIndex(j - 1)) {
                    array.setElementByIndex(j, array.getElementByIndex(j - 1));
                } else {
                    break;
                }
            }
            array.setElementByIndex(j, element);
        }
        logger.log(Level.INFO, "Array has been sorted by insertsSort. Result: " + array);
        return array;
    }

    @Override
    public CustomArray selectionSort(CustomArray array) throws CustomArrayException {
        if (array == null || array.getLength() == 0) {
            throw new CustomArrayException("Input CustomArray is empty or null");
        }
        logger.log(Level.DEBUG, "Input array in selectionSort: " + array);
        for (int i = 0; i < array.getLength(); i++) {
            int minElementPosition = i;
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getElementByIndex(j) < array.getElementByIndex(minElementPosition)) {
                    minElementPosition = j;
                }
            }
            int tmp = array.getElementByIndex(minElementPosition);
            array.setElementByIndex(minElementPosition, array.getElementByIndex(i));
            array.setElementByIndex(i, tmp);
        }
        logger.log(Level.INFO, "Array has been sorted by selectionSort. Result: " + array);
        return array;
    }
}
