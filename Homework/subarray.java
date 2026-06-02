public class subarray {

    public static void printSubarrays(int[] arr) {

        int n = arr.length;

        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        printSubarrays(arr);
    }
}







