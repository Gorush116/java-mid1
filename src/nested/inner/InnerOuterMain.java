package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // InnerOuter 의 참조값을 알 수 있음
        inner.print();

        System.out.println("inner = " + inner.getClass());

    }
}
