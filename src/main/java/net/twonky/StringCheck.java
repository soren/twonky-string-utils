package net.twonky;

import java.util.regex.Pattern;

public class StringCheck {

    static final Pattern emptyPattern = Pattern.compile("^[\\s]*$");

    /**
     * Checks if a string is empty.
     * 
     * The string is considered empty if
     *
     * <ol>
     * <li> it is null
     * <li> its length is 0
     * <li> it contains only whitespace
     * </ol>
     *
     * @param string the string to check.
     *
     * @return true if string is empty else false.
     */
    static public Boolean isEmpty(String string) {
        return string == null || emptyPattern.matcher(string).matches();
    }

    /**
     * Checks if a string consists of only upper case letters.
     *
     * @param string the string to check
     *
     * @return true if string contains only upper case letters else
     * false.
     */
    static public Boolean isUpper(String string) {
        return string == null || string.toUpperCase().equals(string);
    }

    /**
     * Checks if a string consists of only lower case letters.
     *
     * @param string the string to check
     *
     * @return true if string contains only lower case letters else
     * false.
     */
    static public Boolean isLower(String string) {
        return string == null || string.toLowerCase().equals(string);
    }

}
