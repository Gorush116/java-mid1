package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {

        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("new String() == 비교 : " + (str1 == str2));           // false
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));  // true

        String str3 = "hello";  // x003
        String str4 = "hello";  // x004
        System.out.println("리터럴 == 비교 : " + (str3 == str4));            // true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));   // true

        /**
         * 왜 str3과 str4의 참조값이 같을까?
         * -> String pool을 사용하기 때문
         * -> 문자열 리터럴 있으면 String 인스턴스를 미리 생성 후 같은 문자열이 있으면 해당 인스턴스 참조값 반환
        */

        String str5 = str3;
        String str6 = str1;
        System.out.println("리터럴 == 비교(str5) : " + (str5 == str4));            // true
        System.out.println("new String() == 비교(str6) : " + (str1 == str6));            // true
        System.out.println("equals : " + (str5.equals(str6)));

    }
}
