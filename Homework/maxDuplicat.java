import java.util.Scanner;

public class maxDuplicat {
    public static int find(int[] arr){
        int max_d = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    int distance = j-i;
                    if(distance>max_d){
                        max_d=distance;
                    }
                }
            }
        }
        return max_d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
    }
    int res = find(arr);
    System.out.println(res);
    }
}
