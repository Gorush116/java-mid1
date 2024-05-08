package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        // 기본형 : 절대로 같은 값을 공유하지 않는다.
        // 참조형 : 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입
        // 자바는 항상 값을 복사해서 대입한다!!
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
