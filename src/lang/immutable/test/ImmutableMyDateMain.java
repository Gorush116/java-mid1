package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 5, 21);
        MyDate date2 = new MyDate(2024, 5, 21);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        date2.setDay(53);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

//        ImmutableMyDate date3 = date1.setDate(2023, 11, 11);
        System.out.println("연도 변경");
        ImmutableMyDate date3 = date1.withYear(2022);
        System.out.println("date1 = " + date1);
        System.out.println("date3 = " + date3);

        System.out.println("월 변경");
        ImmutableMyDate date4 = date1.withMonth(12);
        System.out.println("date1 = " + date1);
        System.out.println("date4 = " + date4);
        
        // 핵심 : 본인의 값을 변환하지 않고 새로운 객체를 반환

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2044); // date1 = x002, date2 = x001(참조값 변경됨)
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
