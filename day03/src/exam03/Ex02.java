package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int result = calc(3); // 함수 호출 - 기능을 실행
        System.out.println(result);
    }

    static int calc(int x) {
        int y = x * 2 + 3;

        return y; // 함수 종료

    } //반환되는 값에 대한 자료형도 정의해줘야함
}
