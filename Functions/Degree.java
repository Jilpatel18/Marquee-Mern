public class Degree {
    public static float convertToFahrenheit(double celsius) {
        return (float) ((celsius * 9/5) + 32);
    }

    public static void main(String[] args) {
        int celsius = 25;
        float fahrenheit = convertToFahrenheit(celsius);
        System.out.println(fahrenheit);
    }
}
