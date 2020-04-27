package com.problemsolving.standard_algorithm;

/**
 * Input:  txt[] =  "AABAACAADAABAABA"
 * pat[] =  "AABA"
 * Output: Pattern found at index 0
 * Pattern found at index 9
 * Pattern found at index 12
 */
public class OptimizedNaivePatternSearchingAlgorithm {
    public static void naivePatternMatchingAlgorithm(String str, String pat) {
        int i = 0, j = 0, limit = str.length() - pat.length();
        while (i <= limit) {
            for (j = 0; j < pat.length(); j++) {
                if (pat.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.println("Pattern found at index: " + i);
                i++;
            } else if (j == 0) {
                i++;
            } else {
                i += j;
            }
        }

    }

    public static void main(String[] args) {
        String str = "AABAACAADAABAABA";
        String pattern = "AABA";
        naivePatternMatchingAlgorithm(str, pattern);
    }
}
