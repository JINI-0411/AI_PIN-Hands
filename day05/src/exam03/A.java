package exam03;

public class A {
    int num1; // default : 같은 패키지 내에서만 접근 가능
    public int num2; // public : 다른 패키지 더라도 접근 가능
    private int num3; // private : 같은 클래스 내부에서만 접근 가능
    protected int num4; // default + 상속을 통한 외부 패키지 범위 클래스의 private


    public void method() { // 클래스 내부 - 클래스 내에 정의된 메서드(함수) 정의 내부
        // 여기 메서드는 다른말로 인스턴스 메서드라고 함/이미 변수공간은 다 할당되어있다는 것임
        // 객체가 만들어진 상태에서 메소드가 실행가능함
        // 이미 완성된 시점임
        // 인스턴스 메서드 : 객체 생성 이후 객체의 참조 변수를 통해서만 호출 가능
        num3 = 100;
        System.out.println(num3);

    }
}
