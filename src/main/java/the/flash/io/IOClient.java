package the.flash.io;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2018/11/22 13:46
 * @Modified By:
 */
public class IOClient {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world22222222222222222222222222222").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
