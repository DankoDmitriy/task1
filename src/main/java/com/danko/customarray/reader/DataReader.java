package com.danko.customarray.reader;

import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.validation.CustomFileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
    public static Logger logger = LogManager.getLogger();

    public ArrayList<String> reader(String fileAddress) throws CustomArrayException {
        if (!CustomFileValidator.isFileValidation(fileAddress)) {
            logger.log(Level.ERROR, "File can not valid for CustomArray...");
            throw new RuntimeException("File can not valid for CustomArray...");
        }
        logger.log(Level.DEBUG, "File has been validated");
        ArrayList<String> arrayList = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileAddress));
            String readLine = null;
            while ((readLine = reader.readLine()) != null) {
                arrayList.add(readLine);
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File reade exception");
            throw new CustomArrayException("File reade exception");
        }
        logger.log(Level.INFO, "File was read. Result:" + arrayList.toString());
        return arrayList;
    }
}
