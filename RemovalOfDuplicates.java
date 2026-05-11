
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovalOfDuplicates {
    public static void main(StringAnagrams[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[],n,i;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Removal Of Duplicates");
        displayArray(arr);
        System.out.println("After Removal Of Duplicates");
        removeDuplicates(arr);
        sc.close();
    }
    public static void displayArray(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void removeDuplicates(int x[]){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<x.length;i++){
            if(!list.contains(x[i])){
                System.out.print(x[i]+" ");
                list.add(x[i]);
            }
        }
    }
}
