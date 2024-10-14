package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // new 메모리 만든것
        s1.id = 1000; // s1은 이제 뭔갈 담을 수 있음 -> 변수가 된것 -> 객체가 만들어진것
        s1.name = "이이름";
        s1.major = "자바";
        s1.study();

    }
}
