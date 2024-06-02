package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정. 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용(캐싱, String Pool 유사함), 불변
        Integer integerObj2 = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용(캐싱, String Pool 유사함), 불변
        Long longObj = Long.valueOf(100); // boxing
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); // Unboxing
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));       // false(주소 비교)
        System.out.println("equals : " + (newInteger.equals(integerObj)));  // true(값 비교)
        System.out.println("==(cache) : " + (integerObj == integerObj2));  // true(캐싱)
    }
}
