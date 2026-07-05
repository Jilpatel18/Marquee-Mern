public class IsVowel {
    public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
} 
public static void main(String[] args) {
    char character = 'a';
    if (isVowel(character)) {
        System.out.println(character + " is a vowel.");
    } else {
        System.out.println(character + " is not a vowel.");
    }
}
}
