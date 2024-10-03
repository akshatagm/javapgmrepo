package Assignment7;

public class Book {

    private String title;
    private String author;
    private double price;
    private int publicationYear;


    Book(String title,String author,double price,int publicationYear){
        this.title=title;
        this.author=author;
        this.price=price;
        this.publicationYear=publicationYear;

    }

      void setTitle(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }

    void setAuthor(String author){
        this.author=author;
    }
    String getauthor(){
        return author;
    }
    void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
    int getPublicationYear(){
        return publicationYear;
    }
    void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }

    public void displayInfo(){
        System.out.println(title+" "+author+" "+price+" "+publicationYear);
    }

    public double discountedPrice(double discountPercetage){
        return price-(price*(discountPercetage/100));





    }
}
