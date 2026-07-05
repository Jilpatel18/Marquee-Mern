package Classwork;

import java.util.Scanner;

public class count {
    public static int count_digit(int n){
        int count = 0;
        while (n>0) { 
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = count_digit(n);
        System.out.println(res);
    }
}

