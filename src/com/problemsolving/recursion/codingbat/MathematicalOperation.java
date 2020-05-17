package com.problemsolving.recursion.codingbat;

public class MathematicalOperation {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * We have a number of bunnies and each bunny has two big floppy ears. We want to compute
     * the total number of ears across all the bunnies recursively (without loops or multiplication).
     */
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1) return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
     * have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they
     * each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n
     * (without loops or multiplication).
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;
        else if (bunnies == 1)
            return 2;
        else if (bunnies == 2)
            return 5;
        else {
            if (bunnies % 2 == 1) {
                return 2 + bunnyEars2(bunnies - 1);
            } else {
                return 3 + bunnyEars2(bunnies - 1);
            }

        }
    }

    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has
     * 3 blocks, and so on. Compute recursively (no loops or multiplication) the total
     * number of blocks in such a triangle with the given number of rows.
     * triangle(0) → 0
     * triangle(1) → 1
     * triangle(2) → 3
     */
    public int triangle(int rows) {
        if (rows == 0)
            return 0;
        else {
            return rows + triangle(rows - 1);
        }
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no loops).
     * Note that mod (%) by 10
     * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
     * rightmost digit (126 / 10 is 12).
     * sumDigits(126) → 9
     */
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int rem = n % 10;
            return rem + sumDigits(n / 10);
        }
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2
     */
    public int count7(int n) {
        if (n == 0) {
            return 0;
        } else {
            int rem = n%10;
            if (rem == 7) {
                return 1 + count7(n / 10);
            } else {
                return count7(n/10);
            }
        }
    }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count of the occurrences
     * of 8 as a digit,
     * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
     */
    public int count8(int n) {
        return adjacentCount8(n,false);
    }

    public int adjacentCount8(int n, boolean flag) {
        if (n == 0) {
            return 0;
        } else {
            int rem = n%10;
            if (rem == 8 && flag) {
                return 2 + adjacentCount8(n/10,true);
            } else if (rem == 8 && !flag) {
                return 1 + adjacentCount8(n/10, true);
            } else {
                return adjacentCount8(n/10,false);
            }
        }
    }

    public static void main(String[] args) {
        MathematicalOperation mop = new MathematicalOperation();
        int n = 4;
        System.out.println("Factorial Of 4 is: "+mop.factorial(n));
        System.out.println("No Of Bunny Ears for 4 Bunny is: "+mop.bunnyEars(n));
        System.out.println("Fibonacci of 5: " + mop.fibonacci(5));
        System.out.println("No Of Bunny Ears2: " + mop.bunnyEars2(4));
        System.out.println("No Of Triangle: " + mop.triangle(4));
        System.out.println("Sum Of Digits: 126 is "+mop.sumDigits(126));
        System.out.println("No Of 7 in 717171 is: "+mop.count7(717171));
        System.out.println("Adjacent count8 of 8818 is: "+mop.count8(8818));
    }
}
