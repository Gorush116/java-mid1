package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 : " + isSame(str3, str4));

        /**
         * equals 사용해야 하는 이유
         * -> 값 비교시 해당 String이 new String()을 통해 선언되었는지, 리터럴을 통해 선언되었는지 모르기 때문에
         * -> 사용하지 않을 때 같은 값에서 다른 결과가 나올 수 있음
         */
    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
