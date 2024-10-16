package exam01;

public abstract class Calculator {

    // 생성자는 없을 수 없음 그래서 기본생성자가 만들어짐
    public Calculator() {
        System.out.println("Calculator 생성자!");
    }
    // 여기까지가 기본생성자 정의
    public abstract int add(int num1, int num2);


    public  void method(){
        System.out.println("Calculator");
    }
}
