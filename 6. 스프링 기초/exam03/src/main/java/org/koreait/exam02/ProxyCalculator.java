package org.koreait.exam02;

public class ProxyCalculator implements Calculator {

    //    private ImplCalculator cal = new ImplCalculator(); - 유연하게 하기 위해 아래처럼 변경함
//    private Calculator cal = new RecCalculator(); - 개방폐쇄 , 통제하기 위해 아래와 같이 변경

    private Calculator cal;

    public ProxyCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override // 함수안에 코드를 넣는 이유는 통제할려고
    public long factorial(long num) {
        long stime = System.nanoTime(); // 공통기능
        try {
            long result = cal.factorial(num); // 핵심 기능을 대신해서 수행!

            return result;

        } finally { // 공통 기능//이 추가가 된거
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
