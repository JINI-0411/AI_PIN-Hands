package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "김이름", "영어"); //기본 생성자->생성자 오버로드

        Student s2 = new Student(1002, "박이름", "수학");
    // s1, s2는 참조 변수/ 객체 아님

        s1.showInfo();
        s2.showInfo();

//         Class. = Student.class;

    }
}
