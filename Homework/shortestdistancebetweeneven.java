public class shortestdistancebetweeneven {
    
    public static int shortBetweenEven(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0)
                ++size;
        }
        int[] temp = new int[size];
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                temp[j] = i;
                j++;
            }
        }
        int distance = Integer.MAX_VALUE;
        if (size < 2) {
            return -1;
        }
        for (int i = 0; i < size - 1; ++i) {
            distance = Math.min(distance, temp[i + 1] - temp[i]);
        }
        return distance;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 3, 4, 5, 6, 4, 4 };
        System.out.println(shortBetweenEven(arr));
    }
}

