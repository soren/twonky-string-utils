package net.twonky;

import java.util.regex.Pattern;

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
