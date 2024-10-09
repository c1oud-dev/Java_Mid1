package nested.inner.ex2;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();
    }
}
/**
 * Engine을 Car 내부에 집어넣으면서 깔끔해졌다.
 * 결과는 여전히 똑같은 걸 볼 수 있다.
 */
