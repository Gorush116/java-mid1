package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " : " + arr[i].length());
            sum += arr[i].length();
        }

        System.out.println("sum = " + sum);

        int sum2 = 0;
        for (String s : arr) {
            System.out.println(s + " : " + s.length());
            sum2 += s.length();
        }

        System.out.println("sum2 = " + sum2);
    }
}
