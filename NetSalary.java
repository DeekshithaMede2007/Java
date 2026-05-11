
import java.util.*;

public class NetSalary {
    public static void main(StringAnagrams[] args) {
        Scanner sc=new Scanner(System.in);
        int empid=sc.nextInt();
        StringAnagrams name=sc.next();  
        double bs=sc.nextDouble();
        double ta=sc.nextDouble();
        double da=sc.nextDouble();
        double hra=sc.nextDouble();
        double pt;
        if(bs>20000){
            pt=(double)(bs*10)/100;
        }
        else if(bs>10000){
            pt=(double)(bs*4)/100;
        }
        else{
            pt=(double)200;
        }
        double gs=bs+ta+da+hra;
        double ns=gs-pt;
        System.out.println("Enter your Employee ID : "+empid);
        System.out.println("Enter your Name : "+name);
        System.out.println("Enter your Basic Salary : "+bs);
        System.out.println("Enter your TA : "+ta);
        System.out.println("Enter your DA : "+da);
        System.out.println("Enter your HRA : "+hra);
        System.out.println("Enter your PT : "+pt);
        System.out.println("Enter your Gross Salary : "+gs);
        System.out.println("Enter your Net Salary : "+ns);
        sc.close();
    }
}
