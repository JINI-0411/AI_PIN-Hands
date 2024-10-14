package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student.id = 1000;

        Class cls = Student.class; // 얘도 클래스 클래스 객체가 생성이 됨

        Student.staticMethod();
    }
}
