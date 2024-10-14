package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = nums1;
        nums2[1] = 22;
        System.out.println(nums1[1]); // 주소값(마스터키)만 델꼬와서 문열고 변경한거
    }
}
