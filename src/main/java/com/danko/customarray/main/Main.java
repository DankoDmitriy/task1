package com.danko.customarray.main;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.parser.Parser;
import com.danko.customarray.service.impl.CustomArrayMathServiceImpl;
import com.danko.customarray.service.impl.CustomArrayMathServiceIntStreamImpl;
import com.danko.customarray.service.impl.CustomArraySortsServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{1, 6, 2, 5, 3, 4, 7, 9, 8, 0};

        CustomArray customArray = new CustomArray(array);
//        CustomArrayMathServiceImpl customArrayMathService = new CustomArrayMathServiceImpl();
//        CustomArraySortsServiceImpl customArraySortsService = new CustomArraySortsServiceImpl();
//
//        customArrayMathService.findMinElement(customArray);
//        customArrayMathService.findMaxElement(customArray);
//        customArraySortsService.bubbleSort(customArray);
//
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("22 333 4444 55555 66666");
//        arrayList.add("as122 211sd 123ds 123dsa");
//        Parser parser = new Parser();
//        parser.parserStringToIntString(arrayList);

//        CustomArrayMathServiceIntStreamImpl customArrayMathServiceIntStream = new CustomArrayMathServiceIntStreamImpl();
//        int a = customArrayMathServiceIntStream.findMinElement(customArray);
//        System.out.println(a);
//        System.out.println(customArrayMathServiceIntStream.calculateSum(customArray));
//        System.out.println(customArrayMathServiceIntStream.countQuantityPositiveElements(customArray));
//        System.out.println(customArrayMathServiceIntStream.countQuantityNegativeElements(customArray));

    }
}
