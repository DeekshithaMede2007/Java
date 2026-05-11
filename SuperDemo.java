class Parent{
    int x=10;
    public Parent(){
        System.out.println("Parent class constructor...");
    }
    void show(){
        System.out.println("Parent class method...");
    }
}
class Child extends Parent{
    int x=20;
    Child(){
        super();
        System.out.println("Child class constructor...");
    }
    void show(){
        super.show();
        System.out.println(super.x);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
    }
}
