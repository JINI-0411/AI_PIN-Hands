package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];// 2차원 배열 2행 3열 -- 총 6개(변수공간) 가 만들어진 것
        //System.out.println(nums); // 시작주소
        // 0행
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        // 1행
        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;
    }
}
