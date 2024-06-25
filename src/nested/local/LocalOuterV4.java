package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡쳐해야 하는지?
        // localVar = 10;
        // paramVar = 20;

        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행됨
        printer.print(); // print()실행시 메서드 안의 지역변수가 어떻게 출력될 수 있을까? -> 힙 영역에 있는 인스턴스 내에 캡쳐를 하여 참조

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);

            /*
                // 인스턴스 변수
                field = int nested.local.LocalOuterV3$1LocalPrinter.value

                // 캡쳐 변수
                field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
                field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar

                // 바깥 클래스 참조
                field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
             */
        }
    }
}
