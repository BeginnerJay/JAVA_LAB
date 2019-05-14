package chapter13;
// 인터페이스는 모든 메서드가 추상이며, 구현 코드는 가지지 않는다.(원칙)
public /*abstract class*/ interface Unit {
    /*abstract*/ void move();
    /*
    {
        System.out.println("이동");
    }
     */
    void attack();
    /*
    {
        System.out.println("공격");
    }
     */

    // 람다, 스트림이 생기면서 인터페이스 기능이 확장되었다.
    // 원론적인 프로그래밍 기법과는 거리가 있다.
    // ex) 모든 유닛이 공통적으로 써야 하는 기능을 추가하는 경우
    // 새로 Unit2를 상속받기도, 클래스를 고치기도 애매!
    // 디폴트 메서드 : 인터페이스에 기본 구현 코드를 작성한다.
    // 정적 메서드 : 인터페이스로부터 호출 가능한 공통의 코드를 작성한다.
        // 구현이 있더라도 소속만 인터페이스일 뿐, 자식 클래스가 구현할 의무는 없다.
    default void die() {
        System.out.println("죽어버림");
    }

    static void moveAttack(Unit unit) {
        unit.move();
        unit.attack();
    }
}
// 메서드를 추상으로 선언하면, 후손에게 구현을 강제하는 효과가 있다.
// 추상 메서드가 없더라도, 객체화를 금지하고 싶으면 추상 클래스로 선언한다.
// ex)정적 메서드만 정의된 클래스, Math 클래스 등
// 추상 클래스는 추상 메서드가 있거나 abstract 지정자로 선언한 클래스이다. 일반 멤버도 가질 수 있다.

// 추상화하지 않으면 공동의 조상이 없어, 이름만 같은 메서드이지 같이 관리하기 어려움