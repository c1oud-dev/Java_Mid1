package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}

/**
 * add 메서드는 결과를 누적하고 자기 자신의 참조값인 this를 반환
 */