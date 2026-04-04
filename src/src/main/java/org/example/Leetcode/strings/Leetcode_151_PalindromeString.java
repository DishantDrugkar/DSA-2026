package org.example.Leetcode.strings;

public class Leetcode_151_PalindromeString {
    public static void main(String[] args) {
        String s = "the blue is sky";
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        String word[] = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i= word.length-1; i>=0; i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
