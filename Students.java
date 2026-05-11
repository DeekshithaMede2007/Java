public class Students {
    StringAnagrams rollno,name;
    static StringAnagrams college;
    public Students(StringAnagrams rollno,StringAnagrams name,StringAnagrams college){
        this.rollno=rollno;
        this.name=name;
        Students.college=college;
    }
    public void display(){
        System.out.println("Roll Num : "+rollno+" \nName : "+name+" \nCollege : "+Students.college+"\n");
    }
    public static void main(StringAnagrams[] args){
        Students s1 = new Students("24B11CS276","Deekshitha","AUS");
        Students s2 = new Students("24B11CS139","Hasini","AUS");
        s1.display();
        s2.display();
    }
}
