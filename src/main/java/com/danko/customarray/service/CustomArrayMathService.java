package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;

public interface CustomArrayMathService {
    int findMinElement(CustomArray array);

    int findMaxElement(CustomArray array);

    double calculateArithmeticMean(CustomArray array);

    int calculateSum(CustomArray array);

    int countQuantityPositiveElements(CustomArray array);

    int countQuantityNegativeElements(CustomArray array);

}
