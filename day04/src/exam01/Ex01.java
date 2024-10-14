package exam01;

public class Ex01 {
    /*main 함수는 프로그램을 시작해 주는 함수*/

    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 10;
//        int result = add(num1,num2);

//        int r = add(10, 20);
//        System.out.println(r);
    int result = add(10,20); // int add(int,int)
        System.out.println(result);


    }




    /* num1, num2, result - 함수 지역 내에서만 유의미한 변수 / 지역변수 */
    static int add(int num1, int num2) {
        //num1과 num2는 실행되기 전(연산을 실행할때)까지는 변수가 아님 // 함수를 실행할때 메모리를 할당받음
        // 리턴으로 함수가 끝난 후에는 역할을 다했기 때문에 제거됨 // 스택 메모리
        int result = num1 + num2;

        return result;
    }
}
