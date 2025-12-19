package org.example.striver.basicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int originalNumber = num;
        int sum = 0;
        while(num > 0){
            int lastdigit = num % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            num = num / 10;
        }
        if(originalNumber == sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong NUmber");
        }
    }
}
