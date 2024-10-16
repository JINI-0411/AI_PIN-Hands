package exam05;

public class Ex01 {
    public static void main(String[] args) {
        // 우선 외부클래스 먼저 만들어야 내부클래스를 만들 수 있음


        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        System.out.println(Outer.Inner.num);

    }
}
