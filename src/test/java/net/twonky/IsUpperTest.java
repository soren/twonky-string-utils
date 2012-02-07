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
        assertTrue(StringUtils.isUpper(null));
        assertTrue(StringUtils.isUpper("0"));
        assertTrue(StringUtils.isUpper(""));
        assertTrue(StringUtils.isUpper(" "));
        assertTrue(StringUtils.isUpper(" \t\n"));
        assertTrue(StringUtils.isUpper("A"));
        assertTrue(StringUtils.isUpper("FOO BAR"));
        assertTrue(StringUtils.isUpper("ÆØÅ"));
    }

    /**
     * Testing non-upper strings.
     */
    public void testNonUpperStrings() {
        assertFalse(StringUtils.isUpper("a"));
        assertFalse(StringUtils.isUpper("b c"));
        assertFalse(StringUtils.isUpper("\nd"));
        assertFalse(StringUtils.isUpper("æøå"));
    }
}
