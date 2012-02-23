package net.twonky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple dirname() methods.
 */
public class DirnameTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DirnameTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(DirnameTest.class);
    }

    /**
     * Testing unix path names.
     */
    public void testUnixPaths() {
        assertEquals("/", StringExtract.dirname("/"));
        assertEquals("/", StringExtract.dirname("/root"));
        assertEquals("/usr/lib/", StringExtract.dirname("/usr/lib/foo"));
        assertEquals("/usr/lib.foo/", StringExtract.dirname("/usr/lib.foo/bar"));
        assertEquals("", StringExtract.dirname("bar.txt"));
    }

    /**
     * Testing windows path names.
     */
    public void testWindowsPaths() {
        assertEquals("C:\\", StringExtract.dirname("C:\\"));
        assertEquals("C:\\", StringExtract.dirname("C:\\Windows"));
        assertEquals("C:\\Users\\", StringExtract.dirname("C:\\Users\\foo"));
        assertEquals("C:\\Users\\foo dir\\", StringExtract.dirname("C:\\Users\\foo dir\\BAR.TXT"));
    }

    /**
     * Testing URLs.
     */
    public void testUrls() {
        assertEquals("http://foo.bar/baz/", StringExtract.dirname("http://foo.bar/baz/"));
        assertEquals("http://foo.bar/baz/", StringExtract.dirname("http://foo.bar/baz/index.html"));
    }

}