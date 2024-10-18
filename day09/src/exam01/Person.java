package exam01;
// 클래스클래스
public class Person extends java.lang.Object{

    private int age;
    private String name;


    public Person() {} // 기본 생성자 추가함

    //생성자 정의 / 매개변수 있는 거
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
