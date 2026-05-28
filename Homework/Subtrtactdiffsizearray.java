import java.util.Scanner;
public class Subtrtactdiffsizearray {
    public static int subtractDifferentSize(int[] arr1, int[] arr2) {
        int n1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            n1 = n1 * 10 + arr1[i];
        }
        int n2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            n2 = n2 * 10 + arr2[i];
        }
        return n1 - n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }   
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int res = subtractDifferentSize(arr1, arr2);
        System.out.println(res);
    }
}
