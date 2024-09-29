package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; //보통 기본형은 소문자로 시작하는데 String은 대문자로 시작
        //대문자로 시작하는 건 참조형이라는 거
        String str2 = new String("hello");

        System.out.println("str = " + str1);
        System.out.println("str2 = " + str2);

    }
}
