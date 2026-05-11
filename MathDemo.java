import java.util.Scanner;
public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        System.out.println("Maximum: " + Math.max(x, y));
        System.out.println("Square root: " + Math.sqrt(x));
        System.out.println("Power of two: " + Math.pow(y, 2));
        System.out.println("Absolute value: " + Math.abs(x+0.546));
        System.out.println("Rounded value: " + Math.round(y+0.546));

        scanner.close();
    }
}