public class StaticBlockDemo {
    static {
        System.out.println("This is Static Block");
    }

    {
        System.out.println("This is Instance Block");
    }

    public static void main(StringAnagrams[] args) {
        StaticBlockDemo obj = new StaticBlockDemo();
        System.out.println("This is main method");
    }
}