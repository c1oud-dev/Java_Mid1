package lang.string.test;

/**
 * str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력
 * indexOf() 를 반복문과 함께 풀면 된다
 */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        int count = 0;
        int index = str.indexOf(key); //6, ..

        while (index >= 0) {
            index = str.indexOf(key, index + 1); //6, 7
            count++;
        }
        //indexOf()의 두번째 인자는 position으로 기본값은 0이다.
        //string에서 key값을 찾기 시작할 위치를 지정한다.
        System.out.println("count = " + count);
    }
}
