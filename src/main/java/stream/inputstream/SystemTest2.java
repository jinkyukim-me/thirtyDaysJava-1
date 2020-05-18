package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest2 {
    public static void main(String[] args) {
        System.out.print("입력: ");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
            while( (i = isr.read()) != '끝') {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
