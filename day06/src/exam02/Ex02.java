package exam02;

public class Ex02 {

    public static void main(String[] args) {
//        Animal[] animals = new Animal[3];
//        animals[0] = new Tiger();   // Animal animals[0] = new Tiger();
//        // 배열도 변수 , 변수가 3개가 있는것 , 애니멀 자료형에 대입한 것
//        animals[1] = new Bird(); // Animal animals[1] = new Bird();
//        animals[2] = new Human(); //  Animal animals[2] = new Human();
//        // 다형성은 유연성이 있음

        Animal[] animals = {new Tiger(), new Bird(), new Human()};
        // 생성과 동시에 초기화

        for (Animal animal : animals) { // 업 캐스팅
            animal.move(); // 여기서 애니멀은 애니멀의 객체가 아니고 각각의 객체임
            Human human = (Human) animal; // 다운 캐스팅
            human.reading();
//        } else if (animal instanceof Bird bird){
//            bird.singing();

        }
    }
}
