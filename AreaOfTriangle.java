
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(StringAnagrams[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double S,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S=(double)(a+b+c)/2;
        area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Sides of the Triangle Area are : ");
        System.out.println("Side1 : "+a);
        System.out.println("Side2 : "+b);
        System.out.println("Side3 : "+c);
        System.out.println("S : "+S);
        System.out.println("Area = "+area);
        sc.close();
    }
}
