package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // str1 처럼 선언시 자바에서 자동으로 str2처럼 변환
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // String 클래스 Java 9 기준 변경사항
        /**
         * value 타입 변경
         * 9 이전 : private final char[] value;
         * 9 이후 : pricate final byte[] value;
         *
         * 변경사항 : 메모리 효율적 사용(char 는 2byte. 영어, 숫자는 1byte로 표현 가능)
         * -> 단순 영어, 숫자로 표현된 경우 1byte(Latin-1 인코딩의 경우) 사용
         * -> 그렇지 않으면 2byte인 UTF-16 인코딩 사용
         */
    }
}
