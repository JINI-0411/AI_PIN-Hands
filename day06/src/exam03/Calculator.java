package exam03;

public abstract class Calculator {

    int num = 10;

    public abstract int add(int num1, int num2); // 정의되지 않아서 추상 메서드임
    // 오류 발생하는 이유 : 컴파일러가 헷갈려해서임
  //  public abstract int minus(int num1, int num2);//
}
