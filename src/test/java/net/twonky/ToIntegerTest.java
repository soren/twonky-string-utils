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
        assertEquals(1, StringConvert.toInteger("1").intValue());
        assertEquals(2, StringConvert.toInteger(" 2 ").intValue());
        assertEquals(-3, StringConvert.toInteger("-3").intValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringConvert.toInteger(null));
        assertNull(StringConvert.toInteger("one"));
        assertNull(StringConvert.toInteger("2."));
        assertNull(StringConvert.toInteger(""));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringConvert.toInteger("null", null));
        assertEquals(new Integer(1), StringConvert.toInteger("one", 1));
    }
}
