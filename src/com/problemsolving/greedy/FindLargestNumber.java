package com.problemsolving.greedy;

public class FindLargestNumber {
    public static void findLargestNumber(int number_of_digits, int sum_of_digits ) {
        int numarr[] = new int[number_of_digits];
        // If Sum of Digits is 0, then either the num will be 0 otherwise none
        if(sum_of_digits == 0){
            if(number_of_digits == 1){
                System.out.println("09");
            }else{
                System.out.println("None");
            }
            return;
        }

        if(sum_of_digits > 9 * number_of_digits){
            System.out.println("None");
            return;
        }

        for (int i = 0; i < numarr.length; i++) {
           if(sum_of_digits > 9){
               numarr[i] = 9;
               sum_of_digits -= 9;
           }else{
               numarr[i] = sum_of_digits;
               sum_of_digits = 0;
               break;
           }
        }

        for (int i = 0; i < numarr.length; i++) {
            System.out.print(numarr[i]);
        }
    }

    public static void main(String[] args) {
        int numOfDigits = 3;
        int sumOfDigits = 20;
        findLargestNumber(numOfDigits, sumOfDigits);
    }
}
