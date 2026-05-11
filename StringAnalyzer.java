
public class StringAnalyzer {
    public static void findCharacterTypes(StringAnagrams k){
        int u=0,l=0,d=0,s=0;
        for(int i=0;i<k.length();i++){
            char ch = k.charAt(i);
            if(ch>=65 && ch<=90){
                u++;
            }
            else if(ch>=97 && ch<=122){
                l++;
            }
            else if(ch>=48 && ch<=57){
                d++;
            }
            else{
                s++;
            }
        }
        System.out.println("Uppercase : "+u);
        System.out.println("Lowercase : "+l);
        System.out.println("Digits : "+d);
        System.out.println("Symbols : "+s);
    }
    public static void main(StringAnagrams[] args) {
        StringAnagrams str;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        str=sc.nextLine();
        findCharacterTypes(str);
    }
}
