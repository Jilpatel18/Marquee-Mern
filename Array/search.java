import java.util.Scanner;

public class search {
    public static boolean sear(int[] arr,int target){
        for (int i =0 ;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            
            }
        }
        return false;
    }
    public static int sear2(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int x = sc.nextInt();
        int res = sear2(arr, x);
        boolean res2 = sear(arr, x);

        System.out.println("Index find at "+res);
        System.out.println(res2);
    }
}
