package org.example.Leetcode.strings;

import java.util.Stack;

public class Leetcode_1021_RemoveParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(remove(s));
    }
    public static String remove(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(!stack.isEmpty()){
                    result.append(c);
                }
                stack.push(c);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
