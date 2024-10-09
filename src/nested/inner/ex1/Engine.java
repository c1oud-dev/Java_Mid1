package nested.inner.ex1;

//Car에서만 사용
public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    //시동을 걸기 위해선 충전 레벨 확인과 차 모델 정보를 알아야 함
    public void start() {
        System.out.println("충전 레벨 확인 : " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
