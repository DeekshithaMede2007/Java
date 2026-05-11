public class ThisDemo{
    int a,b,c,d;
    public ThisDemo(){
        a=10;
    }
    public ThisDemo(int b){
        this();
        this.b=b;
    }
    public ThisDemo(int b,int c){
        this(b);
        this.c=c;
    }
    public ThisDemo(int b,int c,int d){
        this(b,c);
        this.d=d;
    }
    public void show(){
        System.out.println(a+" "+b+" "+c+" "+d);
    }
    public static void main(StringAnagrams[] args) {
        ThisDemo td = new ThisDemo(20,30,40);
        td.show();
    }
}