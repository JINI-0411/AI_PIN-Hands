package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C(); // C -> B -> A
        A ac = c;

        A a = new C(); // C로 만들고 자료형은 a로 하겠다는....
        B b = new C();
        // 예를 들면 A,B,C라는 강의실이 있어도 건물주소는 동일함
    }
}
