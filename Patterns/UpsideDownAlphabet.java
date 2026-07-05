public class UpsideDownAlphabet {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}