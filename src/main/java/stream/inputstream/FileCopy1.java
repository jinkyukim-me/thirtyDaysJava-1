package stream.inputstream;

import java.io.*;
import java.net.Socket;

public class FileCopy1 {
    public static void main(String[] args) throws IOException {
        long milliseconds = 0;

        try( FileInputStream fis = new FileInputStream("a.zip");
             FileOutputStream fos = new FileOutputStream("copy1.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            milliseconds = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;

        } catch(IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();

        BufferedReader isr =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();
 
        System.out.println("시간: " + milliseconds);
    }
}
