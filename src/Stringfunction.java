public class Stringfunction{
    public static void main(String[] args) {
        String s1="welcome to java";

        System.out.println(s1==s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(+s1.length());
        System.out.println(s1.concat("world"));
        System.out.println(s1.charAt(1));
        System.out.println(s1.equals("welcome"));
        System.out.println(s1.contains("wel"));
        System.out.println(s1.substring(0,7));
        System.out.println(s1.replace('w','W'));
        System.out.println(s1.replaceAll("java","selenium"));
        System.out.println(s1.indexOf('e'));



    }
}