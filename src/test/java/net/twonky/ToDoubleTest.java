package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple toDouble() methods.
 */
public class ToDoubleTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToDoubleTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToDoubleTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1.0, StringUtils.toDouble("1").doubleValue());
        assertEquals(2.0, StringUtils.toDouble(" 2 ").doubleValue());
        assertEquals(-3.0, StringUtils.toDouble("-3").doubleValue());
        assertEquals(4.5, StringUtils.toDouble("4.5").doubleValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringUtils.toDouble(null));
        assertNull(StringUtils.toDouble("one"));
        assertNull(StringUtils.toDouble("2,"));
        assertNull(StringUtils.toDouble("3.4.5"));
        assertNull(StringUtils.toDouble(""));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringUtils.toDouble("null", null));
        assertEquals(new Double(1.1), StringUtils.toDouble("one", 1.1));
    }
}
