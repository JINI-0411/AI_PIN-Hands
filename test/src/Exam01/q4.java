package Exam01;

public class q4 {
    public static void main(String[] args) {
        int num;
        int times;
        for (num=1; num<=9; num++) {
            for (times=1; times<=9; times++) {
                if (num%2==0) {continue;}
                System.out.println(num+"x"+times+"="+num*times);
            }
        }
    }
}
