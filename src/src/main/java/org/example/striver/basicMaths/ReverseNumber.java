package org.example.striver.basicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 7789;
        int rev = 0;
        while(num > 0){
            int lastdigit = num % 10;
            rev = (rev* 10) + lastdigit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
