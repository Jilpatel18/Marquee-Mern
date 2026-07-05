import java.util.Scanner;

public class frequency {
    public static int fre(int n , int dig){
        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem == dig) count++;
            n/=10;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter the digit whose frequency u want to know: ");
        int dig = sc.nextInt();
        int res = fre(n,dig);
        System.out.println(res);
    }
}
