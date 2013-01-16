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
 * Unit test for simple toByte() methods.
 */
public class ToByteTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToByteTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToByteTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1, StringConvert.toByte("1").byteValue());
        assertEquals(2, StringConvert.toByte(" 2 ").byteValue());
        assertEquals(-3, StringConvert.toByte("-3").byteValue());
        assertEquals(-128, StringConvert.toByte("-128").byteValue());
        assertEquals(127, StringConvert.toByte("127").byteValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringConvert.toByte(null));
        assertNull(StringConvert.toByte("one"));
        assertNull(StringConvert.toByte("2."));
        assertNull(StringConvert.toByte(""));
        assertNull(StringConvert.toByte("-129"));
        assertNull(StringConvert.toByte("128"));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringConvert.toByte("null", null));
        assertEquals(new Byte((byte)1), StringConvert.toByte("one", (byte)1));
    }
}
