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

/**
 * Command line utility to call the string utility methods directly
 * from the command line.
 *
 * @see net.twonky.StringCheck
 * @see net.twonky.StringExtract
 */
public class StringUtils {

    static private final String VERSION = "${project.version}";
    static private final String PROGRAM = "stringutils";

    static private StringCheck check = new StringCheck();    
    static private StringExtract extract = new StringExtract();

    /**
     * Create the program name including version number.
     *
     * @return the name of the program with the version number appended.
     */
    static public String getProgramName() {
        return PROGRAM + " " + VERSION;
    }

    static private void printUsage() {
        System.out.println("Usage: " + PROGRAM + " <options>\n");
        System.out.println("where <options> is one of");
        System.out.println("                    -h  prints help");
        System.out.println("                    -v  prints version info");
        System.out.println(" -e|-u|-l|-i|-p string  performs the specified check on the");
        System.out.println("                        string printing out true/false.");
        System.out.println("                        Available checks are:");
        System.out.println("                          e - is string empty (or contains only white space)");
        System.out.println("                          u - is string all upper case");
        System.out.println("                          l - is string all lower case");
        System.out.println("                          i - does string represent an integer");
        System.out.println("                          p - does string represent a positive integer");
        System.out.println("        -b|-d filename  extracts either the basename or dirname of the filename");
    }

    static private void printVersion() {
        System.out.println(getProgramName());
        System.out.println("Copyright (C) 2012 Søren Lund\n");
        System.out.println("This program is free software; you can redistribute it and/or modify");
        System.out.println("it under the terms of the GNU General Public License as published by");
        System.out.println("the Free Software Foundation; version 2 dated June, 1991 or at your option");
        System.out.println("any later version.\n");                
    }

    static private Object getOutput(char opt, String arg) {        
        switch (opt) {
        case (int)'e': return check.isEmpty(arg);
        case (int)'u': return check.isUpper(arg);
        case (int)'l': return check.isLower(arg);
        case (int)'i': return check.isInt(arg);
        case (int)'p': return check.isPosInt(arg);
        case (int)'b': return extract.basename(arg);
        case (int)'d': return extract.dirname(arg);
        default: return null;
        }        
    }

    /**
     * Main method.
     *
     * @param args command line arguments.
     */
    static public void main(String[] args) {

        /* 
         * We need one or two arguments and the first should always be
         * a single letter option starting with at dash.
         */
        if (args.length < 1 || args.length > 2 || args[0].length() != 2 || args[0].charAt(0) != '-') {
            printUsage();
        } else if (args.length == 1) { // Should be either '-h' or '-v'
            switch (args[0].charAt(1)) {
            case (int)'v': printVersion(); break;
            case (int)'h': printUsage(); break;
            default: System.err.println("Unknown option: '" + args[0] + "'"); break;
            }            
        } else {
            Object output = getOutput(args[0].charAt(1), args[1]);
            if (output != null) {
                System.out.println(output.toString());
            } else {
                System.err.println("Unknown option: '" + args[0] + "'");
            }
        }
    }
}
