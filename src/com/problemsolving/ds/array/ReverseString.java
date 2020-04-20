package com.problemsolving.ds.array;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Geeks";
        //String revStr = reverseStringOps(str);
        System.out.println(" Reverse String: "+reverseStringRecs(str));
    }

/*    public static String reverseStringOps(String str) {
        char arr[] = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = arr.length - 1; i >= 0; --i) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }*/

    public static String reverseStringRecs(String str) {
        if(str.length()<1)
            return str;
        else return str.charAt(str.length()-1) + reverseStringRecs(str.substring(0,str.length()-1));
    }
}
