package string;

public class methods {
    public static void main(String[] args) {
        String name = "Namaste Bharat";
        String name2 = "    Hello   ";
        String name3 = "White";
        String name4 = "QWERTY";
        System.out.println(name.length());
        System.out.println(name.concat(name2));
        System.out.println(name.charAt(5));
        System.out.println(name.equals(name2));
        System.out.println(name.substring(2, 7));
        System.out.println(name2.trim());
        System.out.println(name.lastIndexOf(name));
        System.out.println(name.compareTo(name3));
        System.out.println(name3.compareTo(name));
        System.out.println(name.replace('a', 'r'));
        System.out.println(name2.replace('H', 'M').trim().concat("w"));
        System.out.println(name.toUpperCase());
        System.out.println(name4.toLowerCase());
        System.out.println(name2);
    }
}
