package assignment6;

public class Animal {

    public void sound(){
        System.out.println("Sound is..");
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("Dog sounds: Barking");
    }
}
class Cat extends Animal {
    public void sound(){
        System.out.println("Cat sounds: Meow");
    }
}
class Lion extends Animal {
    public void sound(){
        System.out.println("Lion sounds: Roar");
    }
}

