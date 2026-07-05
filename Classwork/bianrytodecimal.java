package Classwork;

import java.util.Scanner;

public class bianrytodecimal {
    public static int change(int n){
        int decimal = 0;
    int power = 1;
    while (n>0) {
        int lastDigit = n%10;
        decimal += lastDigit*power;
        power*=2;
        n/=10;
    }
    return decimal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = change(n);
        System.out.println(res);
    }
}
