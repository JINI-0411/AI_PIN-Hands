package Exam01;

public class for1 {
    public static void main(String[] args) {
            int i;
            int j;

        for (i=1, j=9; i<=40; i++, j++) {
            System.out.println("학생 "+i+", 방번호 "+j%10+"");
        }
    }
}
