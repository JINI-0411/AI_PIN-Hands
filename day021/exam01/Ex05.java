package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        //1바이트씩 data.zip을 읽어와서 1바이트씩 copied_data1.zip로 출력
        long stime = System.currentTimeMillis();
        // 현재 시간을 1000분의 1초 계산 숫자
        try (FileInputStream fis = new FileInputStream("data.zip");
            FileOutputStream fos = new FileOutputStream("copied_data1.zip")){

            while (fis.available()>0){
                fos.write(fis.read());
            }
        }catch (IOException e) {
            e.printStackTrace(); // 성능은 효율적이지 않아서 아주 떨어짐
        }
        long etime = System.currentTimeMillis(); //작업 종료 시간
        // 시간차이가 적을 수록 성능은 우수하다!
        System.out.printf("걸린시간: %d%n", etime-stime);
    }
}
