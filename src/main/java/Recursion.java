package main.java;

import java.util.ArrayList;

public class Recursion {

    public static int power(int n, int m) {
        if (m == 0) return 1;
        if (n == 0) return 0;
        if (m == 1) return n;
        return n * power(n, m - 1);
    }

    public static int digitSum(int n) {
        if (n < 10) return n;
        int firstDigit = n % 10;
        return firstDigit + digitSum(n / 10);
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        if (len == 0 || len == 1) return true;
        if (str.charAt(0) != str.charAt(len - 1)) return false;

        return isPalindrome(str.substring(1, len - 1));
    }

    public static void printOnlyEven(int[] arr) {
        if (arr.length == 0) return;
        if (arr[1] % 2 == 0) System.out.println(arr[1]);
        new ArrayList<Integer>().addAll(arr);
        printOnlyEven(arr.Skip(1));
    }


}
