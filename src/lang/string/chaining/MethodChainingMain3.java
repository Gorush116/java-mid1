package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // 메서드 체이닝은 코드를 읽기 쉽고 간결하게 만들어준다
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
