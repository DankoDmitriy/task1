package com.danko.customarray.parser;

import com.danko.customarray.validation.CustomStringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static Logger logger = LogManager.getLogger();
    public static final String REG_EXP_STRING_TO_INT = "\\s?(\\d+)";

    public int[] parserStringToIntString(ArrayList<String> inputArrayString) {
        if (inputArrayString == null || inputArrayString.size() == 0) {
            logger.log(Level.DEBUG, "Input ArrayList is empty");
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
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        return result;
    }
}
