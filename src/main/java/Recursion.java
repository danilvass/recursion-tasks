package main.java;

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
        int lastDigit = n % 10;
        return lastDigit + digitSum(n / 10);
    }

    //4 Task
    public static boolean isPalindrome(String str) {
        int len = str.length();
        if (len == 0 || len == 1) return true;
        if (str.charAt(0) != str.charAt(len - 1)) return false;

        return isPalindrome(str.substring(1, len - 1));
    }

}
