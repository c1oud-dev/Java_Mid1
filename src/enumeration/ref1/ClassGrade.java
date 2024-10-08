package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}

/**
 * 이전의 DiscountService 클래스에서 if문을 사용했을 때를 보완
 *
 * 10, 20, 30을 넘기면서 ClassGrade 생성자가 생기면 BASIC 인스턴스 안에 10, GOLD엔 20...
 * 이런식으로 담기게 된다. 따라서 if문을 따로 생성하지 않아도 됨
 */