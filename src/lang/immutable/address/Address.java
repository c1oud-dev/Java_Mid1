package lang.immutable.address;

public class Address {
    private String value;

    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
/**
 * 단순히 주소를 보관하는 객체
 */
