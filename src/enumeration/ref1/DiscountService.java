package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        //가격 * 할인률 / 100 = 할인 금액
        return price * classGrade.getDiscountPercent() / 100;
    }
}
