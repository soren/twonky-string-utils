/**
 * This file is part of Twonky String Utils.
 *
 * Copyright (C) 2012 Søren Lund <soren@lund.org>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 dated June, 1991 or at your option
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * A copy of the GNU General Public License is available in the source tree;
 * if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */
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