package lang.string.chaining;

public class ValueAdder {
    private int value;
    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }
    public int getValue() {
        return value;
    }
}
/**
 * 단순히 값을 더하는 기능을 제공하는 클래스
 * add 메서드를 호출할 때마다 내부의 value에 값에 누적
 * add 메서드를 보면 자기 자신의 참조값을 반환한다.
 */
