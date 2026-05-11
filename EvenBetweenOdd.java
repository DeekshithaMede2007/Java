import java.util.*;
public class EvenBetweenOdd {
    public static void main(StringAnagrams[] args) {
        Scanner sc=new Scanner(System.in);
        int n,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        displayArray(arr);
        sort(arr);
        System.out.println("After Sorting: ");
        displayArray(arr);
    }
    public static void sort(int x[]){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
    }
    public static void displayArray(int x[]){
        
    }
}
