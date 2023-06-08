package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen

        if (str == null || str.isEmpty() || str.startsWith("0")) {
            return false;
        }

        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
