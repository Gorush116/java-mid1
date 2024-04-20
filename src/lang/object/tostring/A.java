package lang.object.tostring;

public class A {

    public void paint() {
        System.out.println("A");
        draw();
    }

    public void draw() {
        System.out.println("B");
        draw();
    }
}
