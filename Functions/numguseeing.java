import java.util.*;
public class numguseeing {
    public static void guess(int n){
        if(n<1 && n>100) {
            System.out.println("Not in range");
        }
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int secret = ran.nextInt(100)+1;
        int guess;
        System.out.print("Enter a number: ");
        System.out.println();
        while (true) {
            guess = sc.nextInt();
            if(guess>secret){
                System.out.println("Too High");
            }
            else if (guess<secret){
                System.out.println("Too Low");
            }
            else{
                System.out.println("You gussed correct numberr");
                break;
            }

        }
        

    }
    public static void main(String[] args) {
        guess(0);
    }
}
