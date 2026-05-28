import java.util.Scanner;

public class summation {

    public static int[] add(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int[] res = new int[n];

        
        for (int i = 0; i < n; i++) {
            res[i] = arr1[i] + arr2[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = add(arr1, arr2);

        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }

        sc.close();
    }
}