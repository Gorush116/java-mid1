package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        System.out.println("Dog.Dog");
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
