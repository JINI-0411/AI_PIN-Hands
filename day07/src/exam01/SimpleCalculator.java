package exam01;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator(){
        super(); // 기본생성자
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
        // 지금 add 메서드는 인스턴스 메서드임
        // 인스턴스 메서드는 재정의가 가능 , 정적인거는 재정의할 필요가 없음




    }
}
