package the.flash.io;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/1 22:05
 * @Modified By:
 */

public class AIOClient {

    public static void main(String... args) throws Exception {
        AsynchronousSocketChannel client = AsynchronousSocketChannel.open();
        client.connect(new InetSocketAddress("localhost", 9888)).get();
        client.write(ByteBuffer.wrap("123456789".getBytes()));
        Thread.sleep(1111111);
    }

}