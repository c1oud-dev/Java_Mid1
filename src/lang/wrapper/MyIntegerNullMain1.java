package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new
                MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }
    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            } }
        return null;
    }
}
/**
 * 앞서 만든 MyInteger 래퍼 클래스를 사용했다.
 * 실행 결과를 보면 -1을 입력했을 때 -1을 반환한다.
 * 100을 입력했을 때는 값이 없다는 null을 반환한다.
 */

