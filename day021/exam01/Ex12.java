package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            // 데리고 올때 순서 동일하게 들고와야함
            int num = dis.readInt();
            boolean result = dis.readBoolean();
            String str = dis.readUTF();

            System.out.printf("num=%d, result=%s, str=%s%n", num, result, str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
