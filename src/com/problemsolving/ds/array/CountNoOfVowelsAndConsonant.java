package com.problemsolving.ds.array;

public class CountNoOfVowelsAndConsonant {
    public static void main(String[] args) {
        String str = "goodboy";
        findNoOfVowelsConsonants(str);
    }

    private static void findNoOfVowelsConsonants(String str) {
        int vcount = 0, ccount = 0;
        str.toLowerCase();
        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u') {
                vcount++;
            } else if (arr[i] > 'a' && arr[i] < 'z') {
                ccount++;
            }
        }
        System.out.println("Vowel Count: " + vcount + " Consonant Count: " + ccount);
    }
}
