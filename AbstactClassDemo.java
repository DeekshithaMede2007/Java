import java.util.Scanner;
abstract class Shape{
    Scanner sc=new Scanner(System.in);
    double s1,s2,area;
    //1. Abstract meethod
    public abstract void getInput();
    //2. Abstract method
    public abstract void cal_Area();
    public void show_Area(){
        System.out.printf("Area is : %.2f\n",area);
    }
}
class Rectangle extends Shape{
    public void getInput(){
        System.out.println("Enter length and breadth");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
    }
    public void cal_Area(){
        area=s1*s2;
    }
}
class Circle extends Shape{
    // final double pi=3.14;
    public void getInput(){
        System.out.println("Enter radius");
        s1=sc.nextDouble();
    }
    public void cal_Area(){
        area=Math.PI*s1*s1;     // area=pi*s1*s1;
    }
}
public class AbstactClassDemo {
    public static void main(String[] args) {
        Shape s;
        // s= new Shape():   // It showing Error because for abstract class not possible to create instance.
        System.out.println("Parent Class reference variable holds Rectangle Instance");
        s=new Rectangle();
        s.getInput();
        s.cal_Area();
        s.show_Area();
        System.out.println("Parent Class reference variable holds Circle Instance");
        s=new Circle();
        s.getInput();
        s.cal_Area();
        s.show_Area();
    }
}
