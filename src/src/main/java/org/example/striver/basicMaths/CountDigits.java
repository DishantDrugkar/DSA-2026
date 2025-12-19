package org.example.striver.basicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 77895;
        int count = 0;
        while(num > 0){
            int lastdigit = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
