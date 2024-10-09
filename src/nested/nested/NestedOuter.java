package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3; //바깥 정적 변수
    private int outInstanceValue = 2; //바깥 인스턴스 멤버

    static class Nested { //정적 중첩 클래스
        private int nestedInstanceValue = 1; //내부 인스턴스 변수

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근할 수 없다.
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
