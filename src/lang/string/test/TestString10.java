package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruitsArr = fruits.split(",");

        for (String s : fruitsArr) {
            System.out.println(s);
        }

        String joinedString = String.join("->", fruitsArr);
        System.out.println("joinedString = " + joinedString);

    }
}
