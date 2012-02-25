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

import java.util.regex.Pattern;

/**
 * Contains various static methods to extract parts of a string.
 */
public class StringExtract {
    static final Pattern dirnamePattern = Pattern.compile("^.*[\\/\\\\]");
    static final Pattern basenamePattern = Pattern.compile("[^\\/\\\\]*$");

    /**
     * Returns the basename of a filename or an URL.
     *
     * Note: "/" as input will result in an empty string "" being
     * returned. This is contrary to usual POSIX standard.
     *
     * @param filename a filename or an URL.
     *
     * @return the basename of the filename.
     *
     */
    static public String basename(String filename) {
        return dirnamePattern.matcher(filename).replaceFirst("");
    }

    /**
     * Returns the dirname of a filename or url.
     *
     * Note: the returned dirname will contain and ending file
     * separator character ("/" on Unix and "\" on Windows). This
     * contrary to usual POSIX standard.
     *
     * @param filename a filename or an URL.
     *
     * @return the dirname of the filename.
     *
     */
    static public String dirname(String filename) {
        return basenamePattern.matcher(filename).replaceFirst("");
    }
}
