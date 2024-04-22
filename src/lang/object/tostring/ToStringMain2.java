package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("poppy", 3);
        Dog dog2 = new Dog("happy", 4);

        System.out.println("1. 단순 toString 호출");
        System.out.println("car = " + car.toString());
        System.out.println("dog1 = " + dog1.toString());
        System.out.println("dog2 = " + dog2.toString());

        System.out.println("2. println 내부에서  toString 호출");
        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }

}
