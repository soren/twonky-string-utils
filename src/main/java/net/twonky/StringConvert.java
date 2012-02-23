package net.twonky;

import java.util.regex.Pattern;

public class StringConvert {
    /**
     * Converts the given string to an integer.
     *
     * @param string the sting to convert.
     * @param defaultValue a default value to use if string does not
     * represent a valid integer.
     *
     * @return integer value of string or defaultValue if string
     * does not represent a valid integer.
     *
     */
    static public Integer toInteger(String string, Integer defaultValue) {
        try {
            if (string == null) throw new NumberFormatException();
            return Integer.parseInt(string.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts the given string to an integer.
     *
     * @param string the string to convert.
     *
     * @return integer value of string or null if string does not
     * represent a valid integer.
     *
     */
    static public Integer toInteger(String string) {
        return toInteger(string, null);
    }

    /**
     * Converts the given string to a double.
     *
     * @param string the string to convert.
     * @param defaultValue a default value to use if string does not
     * represent a valid double.
     *
     * @return double value of string or defaultValue if string
     * does not represent a valid double.
     */
    static public Double toDouble(String string, Double defaultValue) {
        try {
            if (string == null) throw new NumberFormatException();
            return Double.parseDouble(string.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts the given string to a double.
     *
     * @param string the string to convert.
     *
     * @return double value of string or null if string does not
     * represent a valid double.
     */
    static public Double toDouble(String string) {
        return toDouble(string, null);
    
    }
}
