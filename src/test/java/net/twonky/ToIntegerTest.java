package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple toInteger() methods.
 */
public class ToIntegerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToIntegerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToIntegerTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1, StringUtils.toInteger("1").intValue());
        assertEquals(2, StringUtils.toInteger(" 2 ").intValue());
        assertEquals(-3, StringUtils.toInteger("-3").intValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringUtils.toInteger("one"));
        assertNull(StringUtils.toInteger("2."));
        assertNull(StringUtils.toInteger(""));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(new Integer(1), StringUtils.toInteger("one", 1));
    }
}
