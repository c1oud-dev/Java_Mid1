package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);

    }
}
/**
 * Class 클래스에는 클래스의 모든 정보가 들어있다.
 * 이 정보를 기반으로 인스턴스를 생성하거나, 메서드를 호출하고, 필드의 값도 변경할 수 있다.
 */