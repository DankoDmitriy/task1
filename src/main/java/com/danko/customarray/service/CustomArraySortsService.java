package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;

public interface CustomArraySortsService {
    CustomArray bubbleSort(CustomArray array) throws CustomArrayException;

    CustomArray insertsSort(CustomArray array) throws CustomArrayException;

    CustomArray selectionSort(CustomArray array) throws CustomArrayException;
}
