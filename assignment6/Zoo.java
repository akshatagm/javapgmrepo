package assignment6;

public class Zoo {

    public static void main(String[] args) {

        //Approach 1:
        /*Animal a=new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        Lion l=new Lion();
        a.sound();
        d.sound();
        c.sound();
        l.sound();*/

        //Approach 2:
        Animal[] a1=new Animal[3];
        a1[0]=new Dog();
        a1[1]=new Cat();
        a1[2]=new Lion();
        a1[0].sound();
        a1[1].sound();
        a1[2].sound();

    }
}

