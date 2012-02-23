package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple isEmpty() method.
 */
public class IsEmptyTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IsEmptyTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(IsEmptyTest.class);
    }

    /**
     * Testing empty strings.
     */
    public void testEmptyStrings() {
        assertTrue(StringCheck.isEmpty(null));
        assertTrue(StringCheck.isEmpty(""));
        assertTrue(StringCheck.isEmpty(" "));
        assertTrue(StringCheck.isEmpty(" \t\n"));
    }

    /**
     * Testing non-empty strings.
     */
    public void testNonEmptyStrings() {
        assertFalse(StringCheck.isEmpty("0"));
        assertFalse(StringCheck.isEmpty("a"));
        assertFalse(StringCheck.isEmpty("b c"));
        assertFalse(StringCheck.isEmpty("\nd"));
        assertFalse(StringCheck.isEmpty("æøå"));
    }

}
