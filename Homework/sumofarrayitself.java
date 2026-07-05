import java.util.Scanner;

public class sumofarrayitself {
    public static int[] sumExceptSelf(int[] arr) {
        int sum = 0;

      
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = sum - arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] result = sumExceptSelf(arr);

      
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
