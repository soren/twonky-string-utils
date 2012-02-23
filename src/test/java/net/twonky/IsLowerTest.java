package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple isLower() method.
 */
public class IsLowerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IsLowerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(IsLowerTest.class);
    }

    /**
     * Testing lower strings.
     */
    public void testLowerStrings() {
        assertTrue(StringCheck.isLower(null));
        assertTrue(StringCheck.isLower("0"));
        assertTrue(StringCheck.isLower(""));
        assertTrue(StringCheck.isLower(" "));
        assertTrue(StringCheck.isLower(" \t\n"));
        assertTrue(StringCheck.isLower("a"));
        assertTrue(StringCheck.isLower("foo bar"));
        assertTrue(StringCheck.isLower("æøå"));
    }

    /**
     * Testing non-lower strings.
     */
    public void testNonLowerStrings() {
        assertFalse(StringCheck.isLower("A"));
        assertFalse(StringCheck.isLower("B C"));
        assertFalse(StringCheck.isLower("\nD"));
        assertFalse(StringCheck.isLower("ÆØÅ"));
    }
}
