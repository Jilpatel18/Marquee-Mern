package Classwork;

import java.util.Scanner;

public class changenum {
    public static  int replace(int num){
        int reverse = 0;
        int result = 0;

        while(num != 0) {

            int digit = num % 10;
            if(digit ==0){
                digit=5;
            }
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        while(reverse!= 0) {

            int digit = reverse % 10;
            result = result * 10 + digit;
            reverse = reverse / 10;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Replaced Number: " + replace(num));
       
    }
}
