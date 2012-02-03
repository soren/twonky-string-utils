package net.twonky;

public class StringUtils {

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
            Integer value = Integer.parseInt(string.trim());
            return value;
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
}
