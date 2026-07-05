package Classwork;

public class OcatalToBinary {
    public static int OctalToBinary(int n){
        int binary = 0;
        int power = 1;
        while (n>0) {
            int lastDigit = n%10;
            binary += decimalToBinary(lastDigit)*power;
            power*=1000;
            n/=10;
        }
        return binary;
    }
    public static int decimalToBinary(int n){
        int binary = 0;
        int power = 1;
        while (n>0) {
            int lastDigit = n%2;
            binary += lastDigit*power;
            power*=10;
            n/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n = 17;
        System.out.println(OctalToBinary(n));
    }
}

