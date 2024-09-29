package lang.string.test;

/**
 * split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라
 */
public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        String[] splitted = email.split("@"); //split을 사용할 땐 무조건 배열
        System.out.println("ID : " + splitted[0]);
        System.out.println("Domain : " + splitted[1]);
    }
}
