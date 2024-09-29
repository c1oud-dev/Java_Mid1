package lang.string.test;

/**
 * str 문자열을 반대로 뒤집어라
 * StringBuilder에 있는 reverse()를 사용해라
 */
public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성
        /*StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());*/ //이렇게 해도 되긴 함
        String reversed = new StringBuilder(str).reverse().toString(); //메서드 체인
        System.out.println(reversed);
    }
}
