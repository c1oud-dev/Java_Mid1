package enumeration.ex0;

public class DiscountService {

    //회원 등급과 가격이 들어오면 즉시 할인
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if(grade.equals("BASIC")) {
                discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인X");
        }

        //가격 * 할인률 / 100 = 할인 금액
        return price * discountPercent / 100;
    }
}
