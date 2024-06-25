package nested.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {

        public void start() {
            
            // 내부 클래스는 바깥 클래스의 인스턴스에 접근 가능 -> car 빼도 됨
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + " 의 엔진을 구동합니다.");

        }
    }

}
