import java.util.Scanner;
class FibonacciSequence{
    public static void main(StringAnagrams args[]){
        int n,i,c,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(a+" "+b+" ");
        c=a+b;
        System.out.println(c+" ");
        for(i=4;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c+" ");
        }
    }
}