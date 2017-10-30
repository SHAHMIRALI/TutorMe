package tutorme;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MessageListener extends Thread {
    ServerSocket server;
    int port = 8888;

    public MessageListener(int port) throws IOException {
        this.port = port;
        server = new ServerSocket(port);
    }

    public MessageListener() throws IOException {
        server = new ServerSocket(port);
    }

    //Client Socket code
    @Override
    public void run() {
        Socket clientSocket;
        try {
            while ((clientSocket == server.accept()) != null) {

            }
        }
        catch (IOException io){

        }
    }
}
