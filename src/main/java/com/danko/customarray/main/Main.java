package com.danko.customarray.main;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.service.CustomArrayMathService;
import com.danko.customarray.service.impl.CustomArrayMathServiceImpl;
import com.danko.customarray.service.impl.CustomArraySortsServiceImpl;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 6, 2, 5, 3, 4, 7, 9, 8, 0};

        CustomArray customArray = new CustomArray(array);
        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();

        customArrayMathService.findMinElement(customArray);
        customArrayMathService.findMaxElement(customArray);
    }
}
