interface I1{
    int x=100;
    void show();
    void message();
}
interface I2{
    int y=200;
    void display();
    void message();
}
class Test implements I1,I2{
    public void show(){
        System.out.println("This is Show Method");
    }
    public void display(){
        System.out.println("This is Display Method");
    }
    public void message(){
        System.out.println("This is Message Method");
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.message();
        t.display();
        System.out.println(I1.x);
        System.out.println(I2.y);
    }
}
