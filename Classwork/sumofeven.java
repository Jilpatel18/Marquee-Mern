package Classwork;

import java.util.Scanner;

public class sumofeven {
    public static int even(int start , int end){
        int sum = 0;
        for (int i = start;i<=end;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.println();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int res = even(start, end);
        System.out.println();
        System.out.println(res);
    }
}
