package exam02;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70}; // 선언과 동시에 초기화 // {괄호안은 담고 싶은 내용 넣기}
        System.out.printf("length=%d%n", nums.length); // 배열 공간의 갯수

        for (int i = 0; i <= 6; i++) {
            System.out.println(nums[i]);
        }

    }
}
