package com.danko.customarray.maker;

import com.danko.customarray.entity.CustomArray;
import com.danko.customarray.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayMaker {
    public static Logger logger = LogManager.getLogger();

    public CustomArray makerCustomArray(int[] numbers) throws CustomArrayException {
        CustomArray customArray = new CustomArray(numbers);
        logger.log(Level.INFO, "Object is created:" + customArray);
        return customArray;
    }
}
