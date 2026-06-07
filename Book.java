public class Book {
    String  titile;
    String  author;
    double price;

    Book(String t,String a,double p){
        titile = t;
         author = a;
         price = p;

    }

    Book(String  t,String a){
        titile = t;
        author = a;
      price = 9.99;
    }

    public  void displayDetails(){
        System.out.println(titile);
        System.out.println(author);
        System.out.println(price);
    }
}
