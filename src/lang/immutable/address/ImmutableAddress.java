package lang.immutable.address;

public class ImmutableAddress {

    // 불변 객체 : 초기 생성 후 값이 변경되지 않음(final은 수단일 뿐)

    // final 추가로 생성할 때 값을 세팅하는 것을 제외하고 변경되지 않음
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
