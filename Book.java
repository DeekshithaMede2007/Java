public class Book {
    int bid,pages;
    float price;
    StringAnagrams title,author;
    public Book(){
        bid=100;
        pages=100;
        price=50f;
        title="C Programming";
        author="Hasini";
    }
    public Book(int id){
        bid=id;
        pages=200;
        price=500f;
        title="C Programming";
        author="Deekshitha";
    }
    public Book(int id,StringAnagrams t){
        bid=id;
        pages=150;
        price=250f;
        title=t;
        author="Bhavana";
    }
    public Book(int id,StringAnagrams t,StringAnagrams a){
        bid=id;
        pages=100;
        price=300f;
        title=t;
        author=a;
    }
    public Book(int id,StringAnagrams t,StringAnagrams a,int p){
        bid=id;
        pages=p;
        price=350f;
        title=t;
        author=a;
    }
    public Book(int id,StringAnagrams t,StringAnagrams a,float pr,int p){
        bid=id;
        pages=p;
        price=pr;
        title=t;
        author=a;
    }
    public void DisplayBook(){
        System.out.println("Book ID : "+bid);
        System.out.println("Book Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("Pages : "+pages);
        System.out.println("");
    }
    public static void main(StringAnagrams[] args) {
        Book b1=new Book();
        Book b2=new Book(101,"C Programming","Balaguruswamy",50);
        Book b3=new Book(102,"C Programming","Karthik",450.6f,600);
        b1.DisplayBook();
        b2.DisplayBook();
        b3.DisplayBook();
    }
}