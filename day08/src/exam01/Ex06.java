package exam01;

public class Ex06 {
    public static void main(String[] args) {
        try (MyResource r1 = new MyResource();
             // 자원이 2개이상일때는 세미콜론으로 추가하면 됨
        MyResource2 r2 = new MyResource2()) {

        } catch (Exception e) {}
    }
}
