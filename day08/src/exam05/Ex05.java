package exam05;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        Set<String> item = new HashSet<>();
        // 집합형태이고 중복이 안된다~
        item.add(new String("ABC"));
        item.add(new String("ABC"));
        item.add("ABC");
        item.add("DEF");
        item.add("GHI");

        System.out.println(item);
    }
}
