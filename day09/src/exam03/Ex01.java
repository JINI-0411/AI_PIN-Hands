package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);

        // 연산은 기본 자료형만 된다!, 같은 자료형의 기본 자료형만 된다!

        int num3 = num1 + num2; // 객체간의 연산불가, 왜? 연산이 됨?
        System.out.println(num3);
    }
}
