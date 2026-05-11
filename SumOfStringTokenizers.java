import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfStringTokenizers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comma separated numbers:");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, ",");

        int sum = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
