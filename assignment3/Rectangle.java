package assignment3;

public class Rectangle {


        double length ;
        double width ;

        void area() {
            double area = length * width;
            System.out.println("the area of rect is    " + area);
        }

        void perimeter() {
            double perimeter = 2 * (length + width);
            System.out.println("the perimeter of rect is    " + perimeter);
        }

        void displaydime() {
            System.out.println(length + " " + width);
        }



//Constructor

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double square) {
        this.length = square;
        this.width = square;
    }
    public Rectangle(double length,double width){

        this.length=length;
        this.width=width;

    }









}











