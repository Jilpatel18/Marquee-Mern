public class MissingNumbers {
    public static void findMissingNumbers(int[] arr) {
        int max = 0;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

   
        int[] freq = new int[max + 1];

        for (int num : arr) {
            freq[num]++;
        }

    
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= max; i++) {
            if (freq[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 6, 7, 10,2,2};
        findMissingNumbers(arr);
    }
}