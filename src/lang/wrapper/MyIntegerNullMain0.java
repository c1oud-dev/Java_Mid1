package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }
    private static int findValue(int[] intArr, int target) { for (int value : intArr) {
        if (value == target) {
            return value;
        }
    }
        return -1;
    }
}
/**
 * findValue()는 배열에 찾는 값이 있으면 해당 값 반환, 찾는 것이 없으면 -1 반환
 * findValue()는 결과로 int를 반환, int와 같은 기본형은 항상 값이 존재해야 함.
 * 그런데 배열에 없는 값인 100을 입력해도 같은 -1을 반환
 * 입력값이 -1일 때를 생각하면 배열에 -1값이 있어서 -1을 반환한 것인지,
 * 아니면 -1값이 없어서 -1을 반환한 것인지 명확하지 않다.
 *
 * 객체의 경우 데이터가 없다는 null이라는 명확한 값이 존재한다.
 */
