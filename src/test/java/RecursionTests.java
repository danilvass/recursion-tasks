package test.java;
import main.java.Recursion;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTests {

    @Test
    void test_power() {
        assertEquals(Recursion.power(0, 0), 1);
        assertEquals(Recursion.power(0, 1), 0);
        assertEquals(Recursion.power(1, 0), 1);
        assertEquals(Recursion.power(2, 0), 1);
        assertEquals(Recursion.power(2, 1), 2);
        assertEquals(Recursion.power(2, 3), 8);
        assertEquals(Recursion.power(2, 4), 16);
    }

    @Test
    void test_sum() {
        assertEquals(Recursion.digitSum(1), 1);
        assertEquals(Recursion.digitSum(9), 9);
        assertEquals(Recursion.digitSum(10), 1);
        assertEquals(Recursion.digitSum(11), 2);
        assertEquals(Recursion.digitSum(111), 3);
        assertEquals(Recursion.digitSum(1000000), 1);
        assertEquals(Recursion.digitSum(10000001), 2);
        assertEquals(Recursion.digitSum(99), 18);
        assertEquals(Recursion.digitSum(123), 6);
        assertEquals(Recursion.digitSum(124), 7);
        assertEquals(Recursion.digitSum(125), 8);
        assertEquals(Recursion.digitSum(126), 9);
        assertEquals(Recursion.digitSum(127), 10);
        assertEquals(Recursion.digitSum(128), 11);
    }

    @Test
    void test_isPalindrome() {
        assertTrue(Recursion.isPalindrome("a"));
        assertFalse(Recursion.isPalindrome("ab"));
        assertTrue(Recursion.isPalindrome("aa"));
        assertFalse(Recursion.isPalindrome("abb"));
        assertTrue(Recursion.isPalindrome("aba"));
        assertFalse(Recursion.isPalindrome("abc"));
        assertFalse(Recursion.isPalindrome("abcb"));
        assertTrue(Recursion.isPalindrome("abcba"));
        assertTrue(Recursion.isPalindrome("aaabbbaaa"));
        assertTrue(Recursion.isPalindrome("aaaaaaaaa"));
        assertTrue(Recursion.isPalindrome("aaaaaaaaa0aaaaaaaaa"));
    }

    @Test
    void test_printEvenNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        Recursion.printEventNumbers(arr, 0);
    }

    @Test
    void test_printEvenIndices() {
        int[] arr = {1, 2, 3, 4, 5};
        Recursion.printEvenIndices(arr, 0);
    }

    @Test
    void test_findSecondMax() {
        assertEquals(4, Recursion.secondMax(new int[] { 1, 2, 3, 4, 5 } ));
        assertEquals(5, Recursion.secondMax(new int[] { 1, 2, 3, 4, 5, 5 } ));
        assertEquals(5, Recursion.secondMax(new int[] { 5, 1, 2, 3, 4, 5 } ));
        assertEquals(5, Recursion.secondMax(new int[] { 9, 5, 1, 2, 3, 4, 5 } ));
        assertEquals(9, Recursion.secondMax(new int[] { 9, 5, 1, 2, 9, 3, 4, 5 } ));
        assertEquals(9, Recursion.secondMax(new int[] { 9, 5, 1, 2, 9, 3, 4, 5, 9 } ));
        assertEquals(9, Recursion.secondMax(new int[] { 0, 0, 0, 0, 9, 5, 1, 2, 9, 3, 4, 5, 9 } ));
        assertEquals(9, Recursion.secondMax(new int[] { 0, 9, 0, 9, 0, 8, 0, 8, 0, 7, 0, 7 } ));
        assertEquals(8, Recursion.secondMax(new int[] { 0, 0, 9, 0, 8, 0, 8, 0, 7, 0, 7 } ));
        assertEquals(7, Recursion.secondMax(new int[] { 0, 0, 0, 8, 0, 0, 7, 0, 7 } ));
    }

    @Test
    void test_listCount() {
        assertEquals(0, Recursion.listCount(new int[] { }));
        assertEquals(1, Recursion.listCount(new int[] { 1 }));
        assertEquals(2, Recursion.listCount(new int[] { 1, 2 }));
        assertEquals(3, Recursion.listCount(new int[] { 1, 2, 3 }));
    }

    @Test
    void test_isBalanced() {
        assertTrue(Recursion.isBalanced("()"));
        assertTrue(Recursion.isBalanced("()()"));
        assertTrue(Recursion.isBalanced("(())"));
        assertTrue(Recursion.isBalanced("(())()"));
        assertTrue(Recursion.isBalanced("(((()()())))"));
        assertTrue(Recursion.isBalanced("(()(((()()()))))"));
        assertTrue(Recursion.isBalanced("((()(((()()())))))"));
        assertTrue(Recursion.isBalanced("(()()()()()(())(()(((()()())))))"));
        assertTrue(Recursion.isBalanced("()(()()()()()(())(()(((()()())))))"));
        assertTrue(Recursion.isBalanced("()(()()()()()(())(()(((()()())))))()()()()"));
        assertTrue(Recursion.isBalanced("()(()()()()()(())(()(((()()())))))()()()()"));

        assertFalse(Recursion.isBalanced("())"));
        assertFalse(Recursion.isBalanced("()))"));
        assertFalse(Recursion.isBalanced(")(()"));
        assertFalse(Recursion.isBalanced("(()"));
        assertFalse(Recursion.isBalanced("(()"));
        assertFalse(Recursion.isBalanced("(((()()()))))"));
        assertFalse(Recursion.isBalanced("((()(((()()()))))"));
        assertFalse(Recursion.isBalanced(")()(()()()()()(())(()(((()()())))))"));
        assertFalse(Recursion.isBalanced("(()(()()()()()(())(()(((()()())))))()()()()("));
        assertFalse(Recursion.isBalanced("()(()()()()()(())(()(((()()())))))()()()()("));
        assertFalse(Recursion.isBalanced("))()(()()()()()(())(()(((()()())))))()()()()("));
        assertFalse(Recursion.isBalanced("()(()()()()()(())(()(((()()())))))()()()()(("));
    }

    @Test
    void test_allFilesInDirectory() {
        ArrayList<File> files = Recursion.allFilesInDirectory(new File("").getAbsoluteFile());
        for (File file: files) {
            assertTrue(file.isFile());
            System.out.println(file.getName());
        }
    }

    @Test
    void test_generateBalancedParentheses() {
        assertParentheses(1, new String[]{"()"});
        assertParentheses(2, new String[]{"(())", "()()"});

        assertParentheses(3, new String[]{
                "((()))", "(()())", "(())()", "()(())", "()()()"
        });

        assertParentheses(4, new String[]{
                "(((())))", "((()()))", "((())())", "((()))()",
                "(()(()))", "(()()())", "(()())()", "(())(())",
                "(())()()", "()((()))", "()(()())", "()(())()",
                "()()(())", "()()()()"
        });
    }

    private void assertParentheses(int count, String[] expected) {
        assertTrue(Arrays.equals(Recursion.generateBalancedParentheses(count).toArray(), expected));
    }

}
