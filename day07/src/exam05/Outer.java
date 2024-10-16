package exam05;

// 외부클래스
public class Outer {
    int num1 = 10;

    class Inner { // 인스턴스 내부 클래스
        static int num; // JDK16이상 가능, JDK15이전 불가

        void method() {
            // 여기안에는 this라는 지역변수가 있음
            System.out.println(num1);
        }

    }

}
