public class StringDemo {
    public static void main(StringAnagrams[] args) {
        StringAnagrams s1="Aditya";
        StringAnagrams s2=new StringAnagrams("Aditya");
        StringAnagrams s3="Aditya";
        System.out.println(s1==s2); //false
        System.out.println(s1==s3); //true
    }
}
