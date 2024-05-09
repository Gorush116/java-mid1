package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        // 불변 객체 인스턴스화
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);


//        b.setValue("부산"); // java: cannot find symbol
        b = new ImmutableAddress("부산"); // 새로 인스턴스화
        // 하지만 내부로직 b의 주소 = a의 주소값을 복사한 값 -> a, b 둘다 변경됨
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
