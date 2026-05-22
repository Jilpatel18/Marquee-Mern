

import java.util.Scanner;

public class gac {

    static int g(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * g(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt() ;
        System.out.println("Factorial of " + n + " is: " + g(n));

//                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int m= sc.nextInt();
                for (int i=1;i<=m;i++)
                {
                    if(i*i>=n && i*i<=m)
                    {
                        System.out.println(i*i);
                    }
                }
            }


}