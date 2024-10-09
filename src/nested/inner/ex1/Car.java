package nested.inner.ex1;

public class Car {
    private String model; //차 모델
    private int chargeLevel; //충전 레벨
    private Engine engine; //엔진 클래스 인스턴스(엔진 내부)

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //Engine 에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine 에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    //시동을 걸면 엔진 시작
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
