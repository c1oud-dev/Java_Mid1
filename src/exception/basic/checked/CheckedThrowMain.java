package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow(); //throws 안 해주면 오류 발생
        System.out.println("정상 종료");
    }
}
