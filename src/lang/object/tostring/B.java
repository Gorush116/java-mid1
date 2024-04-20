package lang.object.tostring;

public class B extends A {
    public void paint() {
        super.paint();
        System.out.println("C");
        this.draw();
    }

    public void draw() {
        System.out.println("D");
    }
}
