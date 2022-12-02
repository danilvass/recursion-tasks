package main.java;

import java.util.Arrays;

public class Recursion {

    //1 Task
    public static int power(int n, int m) {
        if (m == 0) return 1;
        if (n == 0) return 0;
        if (m == 1) return n;
        return n * power(n, m - 1);
    }

    //2 Task
    public static int digitSum(int n) {
        if (n < 10) return n;
        return n % 10 + digitSum(n / 10);
    }

    //4 Task
    public static boolean isPalindrome(String str) {
        int len = str.length();
        if (len == 0 || len == 1) return true;
        if (str.charAt(0) != str.charAt(len - 1)) return false;

        return isPalindrome(str.substring(1, len - 1));
    }

    //5 Task
    public static void printEventNumbers(int[] arr, int index) {
        if (index >= arr.length) { return; }
        if (arr[index] % 2 == 0) {
            System.out.println(arr[index]);
        }
        printEventNumbers(arr, index + 1);
    }

    //6 Task
    public static void printEvenIndices(int[] arr, int index) {
        if (index >= arr.length) { return; }
        if (index % 2 == 0) {
            System.out.println(arr[index]);
        }
        printEvenIndices(arr, index + 1);
    }

    //7 Task
    public static int secondMax(int arr[]) {
        if (arr.length == 0) { return 0; }
        if (arr.length == 1) { return arr[0]; }
        return findSecondMax(arr, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private static int findSecondMax(int arr[], int index, int largest, int secondLargest) {
        if (index >= arr.length) { return secondLargest; }
        if (arr[index] >= largest) {
            secondLargest = largest;
            largest = arr[index];
        } else if (arr[index] >= secondLargest) {
            secondLargest = arr[index];
        }
        return findSecondMax(arr, index + 1, largest, secondLargest);
    }

    //3 Task
    public static int listCount(int arr[]) {
        if (arr.length == 0) { return 0; }
        return 1 + listCount(Arrays.copyOfRange(arr, 1, arr.length));
    }

}
