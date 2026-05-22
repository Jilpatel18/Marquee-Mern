

public class GCD {
    public static void main(String[] args){
        int max = 60;
        int min = 18;
        while (min!=0)
        {
            int rem = max%min;
            max = min;
            min = rem;
        }
        System.out.println(max);
    }
}
