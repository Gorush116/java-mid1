package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024, 10, 11);

        System.out.println("오늘 날짜 = " + now);
        System.out.println("of 날짜 = " + ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("of 날짜 10일 뒤 = " + ofDate);

    }
}
