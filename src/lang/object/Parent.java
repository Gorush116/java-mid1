package lang.object;

// 부모가 없으면 묵시적으로 Object를 상속받는다
public class Parent {
// 아무것도 상속받지 않는 클래스는 extends Object가 생략되어있음

    public void parentMehod() {
        System.out.println("Parent.parentMehod");
    }
}
