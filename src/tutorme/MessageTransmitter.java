package tutorme;

import java.io.IOException;
import java.net.Socket;

public class MessageTransmitter extends Thread {

    String message, hostname;
    int port;

    public MessageTransmitter(String message, String hostname, int, port){
        this.hostname = hostname;
        this.message = message;
        this.port = port;
    }



    //Server socket code
    @Override
    public void run() {
        try {

            Socket serverSocket = new Socket(hostname, port);
            serverSocket.getOutputStream().write(message.getBytes());
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
