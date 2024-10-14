package exam02; // 통제할려고~~ // 통제는 함수로 제어함

public class Ex01 { // public == 접근 제어자
    public static void main(String[] args) {

        Schedule s1 = new Schedule();
//        s1.year = 2024; // 통제 불가
//        s1.month = 2;
//        s1.day = 31; // 31이라는 잘못된 값을 검증하고 대입을 통제하는 방법 현재로선 없음
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);


        // 이런식으로 통제가 안되기 때문에 직접적으로 값을 넣는 건 지양하라고 함
        s1.showDate();

        int month = s1.getMonth();
        System.out.println(month); // month만 조회가 가능함



//        get + 변수명

    }
}
