import java.util.Scanner;

public class fibonacciseries {
    public static void fibo(int n){
        int a = 0;
        int b = 1;
        int temp =0;
        while (n>0) {
            System.out.println(a);
            temp = a+b;
            a = b;
            b = temp;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println();
        fibo(n);
        
    }
}
