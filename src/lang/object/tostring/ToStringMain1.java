package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}
/**
 * Object.toString() 메서드는 객체의 정보를 문자열 형태로 제공한다.
 * 그래서 디버깅과 로깅에 유용하게 사용된다.
 * 이 메서드는 Object 클래스에 정의되므로 모든 클래스에서 상속받아 사용할 수 있다.
 */
