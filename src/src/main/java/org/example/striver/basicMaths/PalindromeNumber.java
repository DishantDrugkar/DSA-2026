package org.example.striver.basicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int originalNumber = num;
        int rev = 0;
        while(num > 0){
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }

        if(originalNumber == rev){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("NOT a Palindrome Number");
        }
    }
}
