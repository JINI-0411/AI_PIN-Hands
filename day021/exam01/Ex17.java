package exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17 {
    public static void main(String[] args) throws Exception {
//        char ch = (char)System.in.read();
//        System.out.println(ch);
    // 이렇게 쓰면 한글은 깨져서 나옴

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // Scanner
        char ch = (char)br.read();
        System.out.println(ch);
    }
}
