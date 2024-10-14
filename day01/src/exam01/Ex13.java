package exam01;

public class Ex13 {
    public static void main(String[] args) {
        double num1 = 10.123; // 실수
        byte num2 = (byte)num1; // 실수 -> 정수로 변경
        // byte에 담길거 같은데도 변경하기 전에 형변환을 시켜줘야함.(명시적 형변환)
        System.out.println(num2);
    }
}
