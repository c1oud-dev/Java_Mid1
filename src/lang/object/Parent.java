package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
/**
 * 자바에서 모든 클래스의 최상위 부모 클래스는 항상 Object 클래스이다.
 * 그래서 원래는 public class Parent extends Object
 * 자바가 알아서 extends Object를 넣어주기 때문에 생략 권장
 */
