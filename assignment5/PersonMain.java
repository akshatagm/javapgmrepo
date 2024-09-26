package assignment5;

public class PersonMain {

    public static void main(String[] args) {
       Person p=new Person();
       p.name="Akshata";
       p.age=25;
       p.display();

       Student s=new Student();
       s.name="AkshataGM";
       s.age=25;
       s.grade='A';
       s.display();

       Teacher t=new Teacher();
       t.name="Onkar";
       t.age=30;
       t.subject="Java";
       t.display();
    }


}
