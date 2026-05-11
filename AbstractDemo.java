abstract class Sample{
    public Sample(){
        System.out.println("Constructor of Abstract Class");
    }
    public abstract void show();
}
class Test extends Sample{
    public Test(){
        System.out.println("Constructor of Test class");
    }
    public void show(){
        System.out.println("This is Abstract Method");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Sample s;
        s=new Test();
        s.show();
    }
}
