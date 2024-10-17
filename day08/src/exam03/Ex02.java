package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Object human = new Human(); // Human, Object
        Bird bird = new Bird(); // Bird, Object
        Tiger tiger = new Tiger(); // Tiger, Object
        // 다형성으로 인해 자동으로 오브젝트 패키지가 있어서 변경해도 문제 없음

        Object[] animals = new Object[3];
        animals[0] = human;
        animals[1] = bird;
        animals[2] = tiger;
    }
}
