package exam02;

public class SimpleCalculator implements Calculator {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2; // 기본 구현내용이 추가된것
    }
}
