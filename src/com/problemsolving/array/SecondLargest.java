package com.problemsolving.array;

/**
 * Given an array A of size N, print second largest element from an array.
 */
public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(" Finding Second Largest Number:::");
        int arr[] = new int[]{89,24,75,11,23,78};
        int result = deriveSecondLargest(arr);
        System.out.println(" Second Largest: "+result);

    }
/*public static void main(String[] args) throws IOException {


    // Using BufferedReader class to take input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // taking input of number of testcase
    int t = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();

    while (t-- > 0) {
        // n : size of array
        int n = Integer.parseInt(br.readLine());

        // Declaring array
        int arr[] = new int[n];

        // to read multiple integers line
        String line = br.readLine();
        String[] strs = line.trim().split("\\s+");

        // array elements input
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(strs[i]);

        //Printing result
         int result = deriveSecondLargest(arr);
         System.out.println(result);
    }
    br.close();
}*/

    public static int deriveSecondLargest(int arr[]) {
        int large = arr[1];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                large = largest;
                largest = arr[i];
            } else if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }
}
