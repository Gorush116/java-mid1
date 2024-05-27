package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "     Java Programming ";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim) : '" + strWithSpaces.trim() + "'");
        System.out.println("공백 제거(strip) : '" + strWithSpaces.strip() + "'"); // whiteSpace + UNICODE 공백 제거(Java 11~)
        System.out.println("앞 공백 제거(stripLeading) : '" + strWithSpaces.stripLeading() + "'"); // whiteSpace + UNICODE 공백 제거(Java 11~)
        System.out.println("뒤 공백 제거(stripTrailing) : '" + strWithSpaces.stripTrailing() + "'"); // whiteSpace + UNICODE 공백 제거(Java 11~)
    }
}
