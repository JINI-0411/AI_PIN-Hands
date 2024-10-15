package exam01;

// A라는 객체를 상속받아서 만들어 줄것임
public class B extends A {
    int numB = 20;

    public B() {
        super(); // 컴파일러가 자동 추가 - A()
        System.out.println("B 생성자!");
    }
}
