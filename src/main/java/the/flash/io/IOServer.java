package the.flash.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IOServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8000);

        // (1) �����������߳�
        new Thread(() -> {
            while (true) {
                try {
                    // (1) ����������ȡ�µ�����
                    Socket socket = serverSocket.accept();

                    // (2) ÿһ���µ����Ӷ�����һ���̣߳������ȡ����
                    new Thread(() -> {
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            // (3) ���ֽ�����ʽ��ȡ����
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data, 0, len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {

                }
            }
        }){}.start();
    }
}

