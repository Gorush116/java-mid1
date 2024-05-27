package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // 보통 불변 객체와 관련된 메서드들은 새로운 객체를 반환하기 때문에 반환 값을 반환해야 한다.

        // 불변 객체의 값은 변경되지 않음
        System.out.println("obj1 = " + obj1.getValue());
    }
}
