interface I1{
    void show();
}
class Sample implements I1{
    public void show(){
        System.out.println("Show Method");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        I1 i;
        i = new Sample();
        i.show();
    }
}