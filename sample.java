
import java.util.*;
public class sample {
    public  static void main(String[] args){
//        double d1 = 99.9999999999;
//        int n = (int) d1;
//        System.out.println(n);
//        int a = 66;
//        char ch = (char) a;
//        System.out.println(ch);
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        char ch = sc.next().charAt(0);
//
//        switch(ch){
//            case '+':
//                System.out.println(num1+num2);
//                break;
//            case '-':
//                System.out.println(num1-num2);
//                break;
//            case '*':
//                System.out.println(num1*num2);
//                break;
//            case '/':
//                if(num2==0){
//                    System.out.println("Divide by zero not possible");
//                }else{
//                System.out.println(num1/num2);}
//                break;
//            case '%':
//                System.out.println(num1%num2);
//                break;
//            default:
//                System.out.println("Invalid numbers");
        for(int i =0;i<=num1;i++){
            if (i%3==0){
            System.out.println(i+" ");}
        }
    }
}
