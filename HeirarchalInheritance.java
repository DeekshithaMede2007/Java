class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
    void sleep(){
        System.out.println("Animal is sleeping...");
    }
}
class Dog extends Animal{
    void gaurd(){
        System.out.println("Dog will protect your home...");
    }
}
class Tiger extends Animal{
    void attack(){
        System.out.println("Tiger is attacking...");
    }
}
public class HeirarchalInheritance {
    public static void main(String[] args) {
        Animal a =new Animal();
        a.eat();
        a.sleep();
        Dog d=new Dog();
        d.eat();
        d.gaurd();
        d.sleep();
        Tiger t=new Tiger();
        t.eat();
        t.attack();
        t.sleep();
    }
}
