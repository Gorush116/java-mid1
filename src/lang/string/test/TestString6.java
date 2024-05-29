package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int index = 0;
        int count = 0;
        while (true) {
            index = str.indexOf(key, index + 1); // 한칸 더해야 그 다음 key 탐색
            if (index < 0) {
                break;
            }
            count++;
        }

        System.out.println("count = " + count);

    }
}
