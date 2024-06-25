package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        
        // 내부 클래스
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
