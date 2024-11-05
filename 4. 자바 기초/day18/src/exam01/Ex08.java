package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) {
        Random random = new Random();
        // long값 범위의 랜덤을 만들어볼거

        long[] nums = random.longs().limit(10).toArray(); // 열개함수를 for문 안쓰고 만듦
        System.out.println(Arrays.toString(nums));
        // 랜덤한 난수가 만들어짐
        // 더블은 0~1미만의 랜덤난수가 만들어짐 참고!

    }
}
