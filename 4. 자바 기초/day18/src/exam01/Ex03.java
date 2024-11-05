package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex03 {
    public static void main(String[] args) {
       String[] items = {"항목1","항목1","항목1","항목2","항목3","항목4","항목5"};

       List<String> newItems = map(items, s-> s+"♥");
        System.out.println(newItems);

    }

    // 무조건 양옆에 **두개를 붙이진 않음 사용자 정의임 // 람다식 사용 // 람다는 사용자 정의 기능임
    public static List<String> map(String[] items, UnaryOperator<String> opr) {
        List<String> newItems = new ArrayList<>();

        for (String item : items) {
            String newItem = opr.apply(item);
            newItems.add(newItem);
        }

        return newItems;
    }
}
