package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);
    }
}
/**
 * 문자열 상수를 사용하면 실수로 상수의 이름을 잘못 입력하면 컴파일 시점에 오류가 발생해
 * 오류를 쉽고 빠르게 찾을 수 있다.
 * 하지만 문자열 상수를 사용해도, 문제를 근본적으로 해결할 순 없다.
 * String 타입은 어떤 문자열이든 입력할 수 있기 때문이다.
 */
