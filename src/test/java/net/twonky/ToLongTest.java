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
 * Unit test for simple toLong() methods.
 */
public class ToLongTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToLongTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToLongTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1L, StringConvert.toLong("1").longValue());
        assertEquals(2L, StringConvert.toLong(" 2 ").longValue());
        assertEquals(-3L, StringConvert.toLong("-3").longValue());
        assertEquals(-9223372036854775808L, StringConvert.toLong("-9223372036854775808").longValue());
        assertEquals(9223372036854775807L, StringConvert.toLong("9223372036854775807").longValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringConvert.toLong(null));
        assertNull(StringConvert.toLong("one"));
        assertNull(StringConvert.toLong("2."));
        assertNull(StringConvert.toLong(""));
        assertNull(StringConvert.toLong("-9223372036854775809"));
        assertNull(StringConvert.toLong("9223372036854775808"));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringConvert.toLong("null", null));
        assertEquals(new Long(1L), StringConvert.toLong("one", 1L));
    }
}
