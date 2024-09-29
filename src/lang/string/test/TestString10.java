package lang.string.test;

/**
 * split()을 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라
 */
public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] parts = fruits.split(",");
        String joined = String.join("->", parts);
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("joinedString = " + joined);
    }
}
