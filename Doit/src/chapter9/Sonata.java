package chapter9;

public class Sonata extends Car {
    @Override
    public void drive() {
        System.out.println("Sonata 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("Sonata 유리창 닦습니다.");
    }
}
