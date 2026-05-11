

class AreaCalculator {
    void calculateArea(int side){
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
    void calculateArea(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    void calculateArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public static void main(StringAnagrams[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculateArea(5);
        calculator.calculateArea(10, 4);
        calculator.calculateArea(3.5);
    }
}