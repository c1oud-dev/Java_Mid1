package lang.string;

public class CharArrayMain {
    public static void main(String[] args) {
        /*char a = '가'; //문자 하나를 담는다.
        System.out.println("a = " + a);*/
        //여러 문자를 담으려면 char 배열을 만들어야 한다.

        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        String str = "hello";
        System.out.println(str);
    }
}
/**
 * char는 문자 하나를 다룰 때 사용하는데 여러 문자를 나열하려면 배열을 사용해야 한다.
 * 자바는 문자열을 보다 편리하게 다루는 String 클래스를 제공한다.
 */