package assignment3;

public class BankAcc {

    private String name;
    private double amount;


    void setName(String name){
        this.name=name;
    }

    void setAmount(double amount){
        this.amount=amount;
    }

    double getAmount(){
        return this.amount;
    }

    String getName(){
        return this.name;
    }

    void display(){
        System.out.println(getName()+" "+getAmount());
    }
}
