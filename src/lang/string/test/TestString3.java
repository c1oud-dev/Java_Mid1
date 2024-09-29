package lang.string.test;

/**
 * str에서 ".txt"문자열이 언제부터 시작하는지 위치를 찾아서 출력. indexOf() 사용
 */
public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        //코드 작성
        int result = str.indexOf(".txt");
        System.out.println("index = " + result);
    }
}
