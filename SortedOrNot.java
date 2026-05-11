import java.util.*;
public class SortedOrNot{
    public static void main(StringAnagrams args[]){
       Scanner sc=new Scanner(System.in);
       int arr[],n,i;
       n=sc.nextInt();
       arr=new int[n];
       for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println(checksorted(arr));
    }
    public static boolean checksorted(int x[]){
        for(int i=0;i<x.length-1;i++){
            if(x[i]>x[i+1]){
                return false;
            }
        }
        return true;
    }
}