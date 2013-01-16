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
 * Unit test for simple toFloat() methods.
 */
public class ToFloatTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ToFloatTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ToFloatTest.class);
    }

    /**
     * Testing legal values.
     */
    public void testLegalValues() {
        assertEquals(1.0f, StringConvert.toFloat("1").floatValue());
        assertEquals(2.0f, StringConvert.toFloat(" 2 ").floatValue());
        assertEquals(-3.0f, StringConvert.toFloat("-3").floatValue());
        assertEquals(4.5f, StringConvert.toFloat("4.5").floatValue());
    }

    /**
     * Illegal values should result in null being returned.
     */
    public void testIllegalValues() {
        assertNull(StringConvert.toFloat(null));
        assertNull(StringConvert.toFloat("one"));
        assertNull(StringConvert.toFloat("2,"));
        assertNull(StringConvert.toFloat("3.4.5"));
        assertNull(StringConvert.toFloat(""));
    }

    /**
     * Testing using a default value.
     */
    public void testDefaultValues() {
        assertEquals(null, StringConvert.toFloat("null", null));
        assertEquals(new Float(1.1f), StringConvert.toFloat("one", 1.1f));
    }
}
