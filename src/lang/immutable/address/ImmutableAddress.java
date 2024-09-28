package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
/**
 * 내부 값이 변경되면 안 되기 때문에 value의 필드를 final로 선언
 * 값을 변경할 수 있는 setValue() 제거
 * 이 클래스는 생성자를 통해서만 값을 설정할 수 있고, 이후에는 값 변경 불가능
 */
