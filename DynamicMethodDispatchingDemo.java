// Upcasting and Dynamic Method Dispatching
class Animal {
    public void makesSound() {
        System.out.println("Animal makes sound...");
    }
}
class Dog extends Animal {
    @Override
    public void makesSound() {
        System.out.println("Dog makes sounds as Woof Woof...");
    }
}
class Tiger extends Animal {
    @Override
    public void makesSound() {
        System.out.println("Tiger makes sounds as Roar Roar...");
    }
}
class Cat extends Animal {
    @Override
    public void makesSound() {
        System.out.println("Cat makes sounds as Meow Meow...");
    }
}
public class DynamicMethodDispatchingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makesSound();
        a = new Dog();
        a.makesSound();
        a = new Tiger();
        a.makesSound();
        a = new Cat();
        a.makesSound();
    }
}
