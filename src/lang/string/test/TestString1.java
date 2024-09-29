package lang.string.test;

/**
 * startWith()을 사용해서 url이 https://로 시작하는지 확인
 */
public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        //코드 작성
        boolean result = url.startsWith("https://");
        System.out.println(result);
    }
}
