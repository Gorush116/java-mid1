package lang.string.builder;

public class StringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");

        /**
         * StringBuilder를 직접 사용하는 것이 더 좋은 경우
         * - 반복문에서 반복해서 문자를 연결할 때
         * - 조건문을 통해 동적으로 문자열을 조합할 때
         * - 복잡한 문자열의 특정 부분을 변경해야 할 때
         * - 매우 긴 대용량 문자열을 다룰 때
         *
         *  StringBuffer도 동일한 기능을 수행하지만 내부에 도익화가 되어 있음
         *  -> 멀티 스레드 환경에서 안전하지만 동기화 오버헤드로 인해 성능이 느리다
         */

    }
}
