import java.util.*;
public class Student {
    StringAnagrams sid,sname,branch;
    int marks;
    public void displayDetails()
    {
        System.out.println(sid+" "+sname+" "+branch+" "+marks);
    }
    public void displayGrade()
    {
        if(marks>90)
            System.out.println("O");
        if(marks>=80)
            System.out.println("A");
        if(marks>=70)
            System.out.println("B");
        if(marks>=60)
            System.out.println("Fail");
    }
    public static void main(StringAnagrams args[])
    {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.sid=sc.nextLine();
        s1.sname=sc.nextLine();
        s1.branch=sc.nextLine();
        s1.marks=sc.nextInt();
        s1.displayGrade();
        s1.displayDetails();
        sc.close();
    }
    
}