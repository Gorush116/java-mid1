package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 1000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int silver = discountService.discount("SILVER", price);
        System.out.println("SILVER 등급의 할인 금액 : " + silver);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 : " + diamondd);

        // 소문자 입력
        int gold2 = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold2);
        
    }
}
