package com.bvan.oop.lessons9_10.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class SymbolCounter {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[14] and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA),[15] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[16] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use,[17][18][19][20] particularly for client-server web applications, with a reported 9 million developers.[21] Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.\n" +
                "\n" +
                "The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).\n" +
                "\n" +
                "The latest version is Java 8 which is the only version currently supported for free by Oracle, although earlier versions are supported both by Oracle and other companies on a commercial basis.";

        Map<Character, Integer> symbolToCount = countSymbols(s);
        printInSortedOrder(symbolToCount);
    }

    private static Map<Character, Integer> countSymbols(String s) {
        Map<Character, Integer> symbolToCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (symbolToCount.containsKey(c)) {
                Integer count = symbolToCount.get(c);
                symbolToCount.put(c, count+1);
            } else {
                symbolToCount.put(c, 1);
            }
        }
        return symbolToCount;
    }

    private static void printInSortedOrder(Map<Character, Integer> symbolToCount) {
        TreeMap<Character, Integer> sortedSymbolToCount = new TreeMap<>(symbolToCount);
        for (Map.Entry<Character, Integer> symbolToCountEntry : sortedSymbolToCount.entrySet()) {
            System.out.println(symbolToCountEntry);
        }
    }
}
