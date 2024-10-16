package exam03;

public class Order implements Buyer, Seller{
    @Override
    public void buy() {
        System.out.println("구매!");

    }

    @Override
    public void sell() {
        System.out.println("판매!");

    } // 2가지 바이어와 셀러의 구현이 필요함

}
