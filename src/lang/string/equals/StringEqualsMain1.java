package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == " + (str1 == str2)); //괄호 넣어줘야 함
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4)); //위에선 false, 여기선 true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}

/**
 * ' == ' 을 했을 때 false가 나오는 이유는 String 클래스이기 때문에 주소가 다름
 */