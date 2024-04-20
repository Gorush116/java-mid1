package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    public static void action(Object obj) {
        System.out.println(obj.getClass());

        // 객체에 맞는 다운캐스팅이 필요
        if (obj instanceof Dog dog) {
            ((Dog) obj).sound();
        } else if (obj instanceof Car car) {
            ((Car) obj).move();
        }
    }
}
