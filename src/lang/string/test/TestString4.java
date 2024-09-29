package lang.string.test;

/**
 * substring()을 사용해서, hello 부분과 .txt부분을 분리
 */
public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
        String fileName = str.substring(0,5); // 5까지라고 적었어도 4번째 인덱스까지만 반환
        String extName = str.substring(5,9);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
