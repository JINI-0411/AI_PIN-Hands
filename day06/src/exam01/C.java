package exam01;

public class C extends B {
    int numC = 30;

    public C() {
        super(); // 컴파일러가 자동 생성 - B()
        System.out.println("C 생성자!");

    }
}
