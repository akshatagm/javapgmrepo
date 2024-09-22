package assignment3;

class CarParent{
    void display(String name,int milage){
        System.out.println(name+" "+milage);
    }
}

class Suzuki extends CarParent{
    void show(String color){
        System.out.println(color);
    }
}
class Maruti extends CarParent{
    void print(int amount){
        System.out.println(amount);
    }
}
class Benz extends CarParent{
    void display(String name,int milage,int amount){
        System.out.println(name+" "+milage+" "+amount);

    }
}
public class Car {
}
