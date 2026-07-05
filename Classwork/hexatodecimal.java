package Classwork;

public class hexatodecimal {
    public static String change(int decimal, int targetbase){
        String res = "";
        while(decimal>0){
            int rem = decimal%targetbase;
            if(rem<10){
                res = rem+res;
            }else{
                res = (char)(rem-10+'A') + res;
            }
            decimal = decimal/targetbase;
        }
        return res;
    }
    public static void main(String[] args) {
        String res = change(132,2);
        System.out.println(res);
    }
}
