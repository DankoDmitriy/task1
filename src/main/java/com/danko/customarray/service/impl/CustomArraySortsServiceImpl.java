package com.danko.customarray.service.impl;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.service.CustomArraySortsService;

public class CustomArraySortsServiceImpl implements CustomArraySortsService {
    @Override
    public CustomArray bubbleSort(CustomArray array) {
        for (int i = 0; i < array.getLength(); i++) {
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getElementByIndex(i) > array.getElementByIndex(j)) {
                    int tmp = array.getElementByIndex(i);
                    array.setElementByIndex(i, array.getElementByIndex(j));
                    array.setElementByIndex(j, tmp);
                }
            }
        }
        return array;
    }

    @Override
    public CustomArray insertsSort(CustomArray array) {
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
        return array;
    }

    @Override
    public CustomArray selectionSort(CustomArray array) {
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
        return array;
    }
}
