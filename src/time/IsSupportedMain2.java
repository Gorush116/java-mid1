package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE); // 지원여부 확인
        System.out.println("supported = " + supported);

        if (now.isSupported(ChronoField.SECOND_OF_MINUTE)) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE); // Unsupported field: SecondOfMinute 발생
            System.out.println("minute = " + minute);
        }
    }
}
