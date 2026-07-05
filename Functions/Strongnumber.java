import java.util.Scanner;

public class Strongnumber {
    public static int fac(int n){
        if (n==1 || n==0 )  return 1;
        return n*fac(n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int ori = n;
        while (n>0) {
            int facto = n%10;
            sum+=fac(facto);
            n/=10;
        }
        System.out.println(sum);
        if (sum == ori){
            System.out.println(ori+" is a strong number");
        }else{
            System.out.println(ori+" is  not a strong number");
        }
    }
}
