package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();    // Student라는 클래스명이 자료형이 될 거
        s1.id = 1000;
        s1.name = "이이름";
        s1.major = "영어";
        s1.showInfo();

        System.out.println("s1:" + System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "수학";
        s2.showInfo();

        System.out.println("s2:" + System.identityHashCode(s2));

    }
}
