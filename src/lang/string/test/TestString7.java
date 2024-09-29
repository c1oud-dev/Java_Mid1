package lang.string.test;

/**
 * 문자의 양쪽 공백을 제거
 */
public class TestString7 {
    public static void main(String[] args) {
        String original = " Hello Java ";
        // 코드 작성
        String result = original.strip();
        System.out.println(result);
    }
}
