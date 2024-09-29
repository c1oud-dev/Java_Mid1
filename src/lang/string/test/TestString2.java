package lang.string.test;

/**
 * length()를 사용해서 arr배열에 들어있는 모든 문자열의 길이 합을 구해라.
 */
public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        //코드 작성
        int sum = 0;
        for (String s : arr) {
            System.out.println(s + " : " + s.length());
            sum += s.length();
        }
        System.out.println("sum = " + sum);
    }
}
