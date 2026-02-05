package org.example.Leetcode.basics;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int  num){
        int originalNumber = num;
        int reverse = 0;
        if(num < 0) return false;

        while(num > 0){
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        if(originalNumber == reverse) return true;

        return false;
    }
}
