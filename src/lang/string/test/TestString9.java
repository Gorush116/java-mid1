package lang.string.test;

import java.util.Arrays;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] splitArr = email.split("@");
        String ID = splitArr[0];
        String Domain = splitArr[1];

        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);

    }
}
