package Assignment7;

public class EBook extends Book {

    double filesize;

    EBook(String title, String author, double price, int publicationYear) {
        super(title, author, price, publicationYear);
    }


    public void displayInfo(){
        System.out.println(filesize);
    }

    @Override
    public double discountedPrice(double discountPercentage) {
        return super.discountedPrice(discountPercentage);
    }
}

