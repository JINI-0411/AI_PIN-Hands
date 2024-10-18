package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;

        System.out.println(trans instanceof Enum);
        Enum<Transportation> trans2 = trans;
    }
}
