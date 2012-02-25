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
 * Unit test for simple isEmpty() method.
 */
public class IsEmptyTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IsEmptyTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(IsEmptyTest.class);
    }

    /**
     * Testing empty strings.
     */
    public void testEmptyStrings() {
        assertTrue(StringCheck.isEmpty(null));
        assertTrue(StringCheck.isEmpty(""));
        assertTrue(StringCheck.isEmpty(" "));
        assertTrue(StringCheck.isEmpty(" \t\n"));
    }

    /**
     * Testing non-empty strings.
     */
    public void testNonEmptyStrings() {
        assertFalse(StringCheck.isEmpty("0"));
        assertFalse(StringCheck.isEmpty("a"));
        assertFalse(StringCheck.isEmpty("b c"));
        assertFalse(StringCheck.isEmpty("\nd"));
        assertFalse(StringCheck.isEmpty("æøå"));
    }

}
