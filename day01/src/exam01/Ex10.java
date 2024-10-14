package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 100000000;
        float num2 = num1; // int -> flout : 자동 형변환 ( 정수 -> 실수)

        long num3 = 100000000000000000L; // 8byte
        float num4 = num3; // long -> float 실수를 표현하는 방법과 정수를 표현하는 방법이 다르기 때문에
                            // 커버 가능 한 범위라고 생각해서 담을 수 있음
    }
}
