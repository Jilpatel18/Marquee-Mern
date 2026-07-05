package Classwork;

import java.util.Scanner;

public class Secondlast {
    public static boolean isEven(int n){
        int secondLastDigit = (n/10)%10;
        return secondLastDigit%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
