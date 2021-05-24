package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;

public interface CustomArrayMathService {
    int findMinElement(CustomArray array) throws CustomArrayException;

    int findMaxElement(CustomArray array) throws CustomArrayException;

    double calculateArithmeticMean(CustomArray array) throws CustomArrayException;

    int calculateSum(CustomArray array) throws CustomArrayException;

    int countQuantityPositiveElements(CustomArray array) throws CustomArrayException;

    int countQuantityNegativeElements(CustomArray array) throws CustomArrayException;

}
