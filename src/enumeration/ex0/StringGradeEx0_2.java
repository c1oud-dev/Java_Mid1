package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD : " + diamondd);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);
    }
}
/**
 * 유효하지 않은 값을 입력하는 경우와
 * 오타가 있을 경우의 예제
 */
