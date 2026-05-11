// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
    
public class Pangraming {
    // Separate method to check pangram
    static boolean isPangram(String str) {

        int[] freq = new int[26];
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        // Check frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPangram(input))
            System.out.println("The given string is a Pangram");
        else
            System.out.println("The given string is NOT a Pangram");
    }
}