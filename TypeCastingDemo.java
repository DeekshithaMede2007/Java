public class TypeCastingDemo {
    public static void main(StringAnagrams[] args) {
        // Type Conversion: Lower Datatype => Higher Datatype
        int x=5;
        float y;
        y=x;
        System.out.println(x+" "+y);
        // Type Casting: Higher Datatype => Lower Datatype
        float p=3.142f;
        int q;
        q=(int)p;
        System.err.println(p+" "+q);
    }
}
