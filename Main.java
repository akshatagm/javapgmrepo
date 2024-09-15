public class Main {



        public static void main(String[] args) {
            Person obj = new Person("Akshata", 25, "Female");
            System.out.println(obj.getname());
            System.out.println(obj.getage());
            System.out.println(obj.getgender());
            obj.setage(30);
            obj.displayinfo();

            Person p=new Person("PA",25);
            p.setgender("NA");
            p.displayinfo();

        }
    }


