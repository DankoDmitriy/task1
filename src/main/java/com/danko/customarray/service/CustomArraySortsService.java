package com.danko.customarray.service;

import com.danko.customarray.entity.CustomArray;

public interface CustomArraySortsService {
    CustomArray bubbleSort(CustomArray array);

    CustomArray insertsSort(CustomArray array);

    CustomArray selectionSort(CustomArray array);
}
