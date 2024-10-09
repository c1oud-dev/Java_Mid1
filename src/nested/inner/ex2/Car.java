package nested.inner.ex2;

public class Car {
    private String model; //차 모델
    private int chargeLevel; //충전 레벨
    private Engine engine; //엔진 클래스 인스턴스(엔진 내부)

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    //시동을 걸면 엔진 시작
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        //내부 클래스는 바깥 클래스의 인스턴스에 접근할 수 있으므로 Car 인스턴스를 따로 생성하지 않아도 됨
        public void start() {
            //기존에는 메서드를 따로 만들어서 호출했는데 그럴 필요가 없다.
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
