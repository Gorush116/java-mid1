package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 모두 소문자
        String str3 = "Hello, World!"; // 다른 문자

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a' : " + "c".compareTo("a")); // ASCII
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello' : " + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Hello' : " + str1.endsWith("Java!"));
    }
}
