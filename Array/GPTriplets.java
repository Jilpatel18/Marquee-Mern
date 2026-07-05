
public class GPTriplets {

    // public static void triplets(int[] arr, int n) {
    //     System.out.println("Geometric triplets for the following are  : ");
    //     for (int j = 1; j < n - 1; j++) {
    //         int i = j - 1;
    //         while (i >= 0) {
    //             int k = j + 1;
    //             while (k < n) {
    //                 if (arr[j] * arr[j] == arr[i] * arr[k]) {
    //                     System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k] + " ) ");
    //                 }
    //                 k++;
    //             }
    //             i--;
    //         }
    //     }
    // }
     public static int countGeometricTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        count++;
                        System.out.println("("+arr[i]+" "+arr[j]+" "+arr[k]+" ) ");
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {2, 8, 10, 15, 16, 30, 32, 64};
        int n = arr.length;
        // triplets(arr, n);
        int result = countGeometricTriplets(arr);
        System.out.println(result);

}
}