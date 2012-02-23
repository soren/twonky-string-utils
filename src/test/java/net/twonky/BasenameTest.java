package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple basename() methods.
 */
public class BasenameTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BasenameTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(BasenameTest.class);
    }

    /**
     * Testing unix path names.
     */
    public void testUnixPaths() {
        assertEquals("", StringExtract.basename("/"));
        assertEquals("root", StringExtract.basename("/root"));
        assertEquals("foo", StringExtract.basename("/usr/lib/foo"));
        assertEquals("foo.bar", StringExtract.basename("/usr/lib/foo.bar"));
        assertEquals("bar.txt", StringExtract.basename("bar.txt"));
    }

    /**
     * Testing windows path names.
     */
    public void testWindowsPaths() {
        assertEquals("", StringExtract.basename("C:\\"));
        assertEquals("Windows", StringExtract.basename("C:\\Windows"));
        assertEquals("foo", StringExtract.basename("C:\\Users\\foo"));
        assertEquals("BAR.TXT", StringExtract.basename("C:\\Users\\foo\\BAR.TXT"));
    }

    /**
     * Testing URLs.
     */
    public void testUrls() {
        assertEquals("", StringExtract.basename("http://foo.bar/baz/"));
        assertEquals("index.html", StringExtract.basename("http://foo.bar/baz/index.html"));
    }

}