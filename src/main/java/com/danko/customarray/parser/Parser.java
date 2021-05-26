package com.danko.customarray.parser;

import com.danko.customarray.exception.CustomArrayException;
import com.danko.customarray.validation.CustomStringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static Logger logger = LogManager.getLogger();
    public static final String REG_EXP_STRING_TO_INT = "\\s?(\\d+)";

    public int[] parserStringToIntString(ArrayList<String> inputArrayString) throws CustomArrayException {
        if (inputArrayString == null || inputArrayString.size() == 0) {
            logger.log(Level.ERROR, "Input ArrayList is empty or size is zero");
            throw new CustomArrayException("Input ArrayList is empty or size is zero");
        }
        Pattern pattern = Pattern.compile(REG_EXP_STRING_TO_INT);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (String s : inputArrayString) {
            if (CustomStringValidator.stringVadidator(s)) {
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    integers.add(Integer.valueOf(matcher.group(1)));
                    logger.log(Level.DEBUG, matcher.group(1));
                }
            }
        }
        if (integers.size() == 0) {
            logger.log(Level.ERROR, "There was no correct information in the data");
            throw new CustomArrayException("There was no correct information in the data");
        }
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        logger.log(Level.INFO, "int[] created.");
        return result;
    }
}
