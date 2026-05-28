import java.util.Scanner;
public class coount_lessthanx {
    public static int countLessThanX(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < x) count++; 
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = countLessThanX(arr, x);
        System.out.println(res);
    }
}
