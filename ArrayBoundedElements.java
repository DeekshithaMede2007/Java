
import java.util.Scanner;

public class ArrayBoundedElements {
    public static void main(StringAnagrams[] args){
        int arr[][],n,m,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        displayMatrix(arr);
        displayBoundaryElements(arr);
        sc.close();
    }
    public static void displayMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.err.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void displayBoundaryElements(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        // Top Horizontal Row
        for(int j=0;j<m;j++){
            System.out.print(matrix[0][j]+" ");
        }
        // Right Vertical Column
        for(int i=1;i<n;i++){
            System.out.print(matrix[i][m-1]+" ");
        }
        // Bottom Horizontal Row
        for(int j=m-2;j>=0;j--){
            System.out.print(matrix[n-1][j]+" ");
        }
        // Left Vertical Column
        for(int i=n-2;i>0;i--){
            System.out.print(matrix[i][0]+" ");
        }
    }
}
