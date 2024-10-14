package exam01;

public class Student {
    static int id;//학번 // 정적메모리에 공간할당받는 데이터 영역이 됨
    String name; // 학생명
    String major; // 전공

    public Student() {
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
        // 정보를 확인할 수 있는 단순한 기능 ( showinfo를 만들었음 )

    }

    static void staticMethod() {
//        this.name = "이이름";
        id = 1000; // 정적 변수 가능

//        this.showInfo();
//        showInfo();
    }
}

