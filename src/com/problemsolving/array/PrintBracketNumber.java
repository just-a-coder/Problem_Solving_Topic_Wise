package com.problemsolving.array;

import java.util.Stack;

public class PrintBracketNumber {

    public static void main(String[] args) {
        String str = "((aa)(bb))(aa)a(bb)b";
        printBracketNumFun(str);
    }

    private static void printBracketNumFun(String str) {
        char arr[] = str.toCharArray();
        int count = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                st.push(count);
                System.out.print(count);
                count++;
            } else if (arr[i] == ')') {
                System.out.print(st.pop());
            }
        }
    }
}
