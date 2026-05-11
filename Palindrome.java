
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            rev=ch+rev; // ramu => r+"" =>a+"r" => m+"ar" => u+"mar" => umar
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
