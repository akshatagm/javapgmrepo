package Assignment7;

public class Main {

    public static void main(String[] args) {
        Book book=new Book("Java","ABC",200.20,1998);
        Book ebook=new Book("Selenium","xyz",500,2000);
        book.displayInfo();
        ebook.displayInfo();


        double bookdiscountPrice=10.0;
        double ebookdiscountPrice=10.0;


        System.out.println(book.getTitle()+ " "+book.discountedPrice(bookdiscountPrice));
        System.out.println(ebook.getTitle()+" "+ebook.discountedPrice(ebookdiscountPrice));

    }

}

