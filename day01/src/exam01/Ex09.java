package exam01;

public class Ex09 {
    public static void main(String[] args) {
        byte num1 = 100; // 1바이트

        int num2 = num1; // byte -> int 로 공간이 충분하기 때문에 자료손실없어서 자료형이 변경된것.
                        // 자동 형변환(묵시적 형변환) : 작은 자료형 -> 큰 자료형
        System.out.println(num2);
    }
}
