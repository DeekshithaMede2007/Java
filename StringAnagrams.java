import java.util.Scanner;
public class StringAnagrams {
    public static boolean isAnagrams(String s1,String s2){
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //String1 Ffrequency Count
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr1[ch-'a']++;
        }
        //String2 Frequency Count
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr2[ch-97]++;
        }
        //Check for the Anagrams or not
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(isAnagrams(str1,str2));
        sc.close();
    }
}