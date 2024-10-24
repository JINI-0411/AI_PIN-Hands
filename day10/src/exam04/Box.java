package exam04;
//<바뀔수 있는 변수 대체로 한글자를 사용함을 넣어줌, T를 많이 사용하고 여러개면 T이후 알파벳 U, V순으로 사용함>
public class Box<T extends Fruit>{ // 꺽쇠형태 클래스를 지네릭클래스라고 함
    private T item;


//    private static T item2; // 처음부터 변수인 static은 자료형이 명확하게 정의 되어 있어야 한다.
//
//    private T[] items = new T[3]; // new연산자는 메모리 생성의 역할을 하는데, 자료형이
//    // 명확해야지만 할당 용량 계산 가능!
//

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String toString(){
        String info = item.info(); // apple.info
        return info;
    }
}
