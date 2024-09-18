package assignment3;

public class Main {

    public static void main(String[] args) {
        //it is default
        Rectangle r1=new Rectangle();
        r1.displaydime();
        r1.area();
        r1.perimeter();
       //this is single parameter
        Rectangle re=new Rectangle(5);
        re.displaydime();
        re.area();
        re.perimeter();
        //this is two parameter
        Rectangle R=new Rectangle(10.5,5.5);
        R.displaydime();
        R.area();
        R.perimeter();




    }
}
