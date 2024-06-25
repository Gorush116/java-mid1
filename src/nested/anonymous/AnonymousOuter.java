package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        // 선언 + 생성을 익명 클래스를 이용해 하나로 합침
        // 익명 클래스 : 이름 없는 지역 클래스를 선언하면서 동시에 생성
        // 익명 클래스는 부모 클래스를 상속 받거나, 인터페이스를 구현해야 한다
        // 사용시 장점 : 클래스 별도 정의 없이 즉석 구현 -> 코드 간결해짐(간단한 구현시 사용)
        Printer printer = new Printer() {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);

    }
}
