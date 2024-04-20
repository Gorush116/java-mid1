package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMehod();

        // toString()은 Object 클래스 method
        String string = child.toString();
        System.out.println("string = " + string);


    }
}
