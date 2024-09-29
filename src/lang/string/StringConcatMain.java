package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b); //a에 b를 더함
        String result2 = a + b;
        String result3 = "hello" + "java";

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
