public class Stringfunction{
    public static void main(String[] args) {
        String s1="welcome to java";
        String s2="akshatamanturi97@gmail.com";

        System.out.println(s1==s1);  //true
        System.out.println(s1.toLowerCase()); //welcome to java
        System.out.println(s1.toUpperCase()); //WELCOME TO JAVA
        System.out.println(+s1.length()); //15
        System.out.println(s1.concat("world")); //welcome to javaworld
        System.out.println(s1.charAt(1)); //e
        System.out.println(s1.equals("welcome to java")); //true
        System.out.println(s1.contains("wel")); //true
        System.out.println(s1.substring(0,7)); //welcome
        System.out.println(s1.replace('w','W')); //Welcome
        System.out.println(s1.replaceAll("java","selenium")); // welcome to selenium
        System.out.println(s1.indexOf('e')); //1
        String a[]=s2.split("@");
        System.out.println(a[0]); //akshatamanturi97
        System.out.println(a[1]); //gmail.com
        System.out.println(s1.equalsIgnoreCase("WELCOME TO JAVA"));// true

    }
}