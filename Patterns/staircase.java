public class staircase {
public static void main(String[] args) {
        int n = 6;
        int stars = 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i % 2 == 0) {
                stars += 2;
            }
        }
    }
}    