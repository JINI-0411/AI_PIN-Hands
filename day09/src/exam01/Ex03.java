package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Class<Person> cls = Person.class;

        Constructor con = cls.getDeclaredConstructor();
        // 매개변수가 없으면 기본생성자를 하나 가지고 옴
        Object obj = con.newInstance();

        Method m1 = cls.getDeclaredMethod("setAge", int.class);
        Object r1 = m1.invoke(obj, 20);
        // 반환값이 없기 때문에 null이 나옴
        System.out.println(r1);

        Method m2 = cls.getDeclaredMethod("getAge");
        Object r2 = m2.invoke(obj);
        int age = (int)r2;
        System.out.println(age);
        System.out.println(obj);




    }
}
