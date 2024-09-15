

    /*Assignment 1:
Create a simple Person class
Requirements:
    Define a class named Person with following attributes
      1. String name
       2. int age
       3. String gender
      Implement a constructor to initialize all these     attributes
     Implement getters for all attributes(name, age, gender)
implement setters for only age

Add a method displayInfo() that prints out the person details in a readable format

Assignment : Enhance your Person class to support constructor overloading
Requirements:
   Add additional constructor that takes name and age, with a default gender value ("NA")

 */

    public class Person {

        private String name;
        private int age;
        private String gender;

        Person(String name,int age,String gender)
        {
            this.name=name;
            this.age=age;
            this.gender=gender;
        }

        Person(String name,int age)
        {
            this.name=name;
            this.age=age;
        }

        public void setgender(String gender)
        {
            this.gender=gender;
        }

        public String getname()
        {
            return name;
        }
        public int getage(){
            return age;
        }
        public String getgender(){
            return gender;
        }
        public void setage(int age) {
            this.age=age;


        }
        void displayinfo(){
            System.out.println(getname()+" "+getage()+" "+getgender());
        }
    }


