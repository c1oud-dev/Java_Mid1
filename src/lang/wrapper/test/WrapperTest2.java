package lang.wrapper.test;

/**
 * 배열에 입력된 모든 숫자의 합을 구하자. 숫자는 double형이 입력될 수 있다.
 */
public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        // 코드 작성
        double sum = 0;
        for (String s : array) {
            double i = Double.parseDouble(s);
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
