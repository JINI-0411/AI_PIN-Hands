package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.'); // 바이트라서 한글자씩 입력했음


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
