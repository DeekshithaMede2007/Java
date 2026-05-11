class Animal{
    public void eat(){
        System.out.println("Animals can eat...");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dogs can bark...");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat(); // Method of Animal
        Dog d = new Dog();
        d.eat(); // Inherited method from Animal
        d.bark(); // Method of Dog
    }
}
