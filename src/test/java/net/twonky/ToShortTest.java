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
 * Unit test for simple toShort() methods.
 */
public class ToShortTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToShortTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToShortTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1, StringConvert.toShort("1").shortValue());
        assertEquals(2, StringConvert.toShort(" 2 ").shortValue());
        assertEquals(-3, StringConvert.toShort("-3").shortValue());
        assertEquals(-32768, StringConvert.toShort("-32768").shortValue());
        assertEquals(32767, StringConvert.toShort("32767").shortValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringConvert.toShort(null));
        assertNull(StringConvert.toShort("one"));
        assertNull(StringConvert.toShort("2."));
        assertNull(StringConvert.toShort(""));
        assertNull(StringConvert.toShort("-32769"));
        assertNull(StringConvert.toShort("32768"));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringConvert.toShort("null", null));
        assertEquals(new Short((short)1), StringConvert.toShort("one", (short)1));
    }
}
