
import java.util.Scanner;
public class Arithmetic {
    public static void main(StringAnagrams[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.err.println("Division = "+(a/b));
        sc.close();
    }
}
