package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        // 불변 객체는 값 변경시 새로운 객체를 반환
        System.out.println(str2);

        // String 클래스는 불변 객체로 설계되어 있기 때문에, 값이 변경되지 않음
        // -> 값 변경시 사이드 이펙트 발생(참조하는 모든 변수의 값이 변경되기 때문에)
    }
}
