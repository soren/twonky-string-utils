package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple isUpper() method.
 */
public class IsUpperTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IsUpperTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(IsUpperTest.class);
    }

    /**
     * Testing upper strings.
     */
    public void testUpperStrings() {
        assertTrue(StringCheck.isUpper(null));
        assertTrue(StringCheck.isUpper("0"));
        assertTrue(StringCheck.isUpper(""));
        assertTrue(StringCheck.isUpper(" "));
        assertTrue(StringCheck.isUpper(" \t\n"));
        assertTrue(StringCheck.isUpper("A"));
        assertTrue(StringCheck.isUpper("FOO BAR"));
        assertTrue(StringCheck.isUpper("ÆØÅ"));
    }

    /**
     * Testing non-upper strings.
     */
    public void testNonUpperStrings() {
        assertFalse(StringCheck.isUpper("a"));
        assertFalse(StringCheck.isUpper("b c"));
        assertFalse(StringCheck.isUpper("\nd"));
        assertFalse(StringCheck.isUpper("æøå"));
    }
}
