package UI.shahmirsChatroom;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tutorme.MessageListener;
import tutorme.MessageTransmitter;

public class shahmirsChatroom extends Application implements WritableGUI {

    TextField portEntry;
    Button connect;
    Button disconnect;
    TextField ipAddress;
    TextArea textArea;
    TextField chatText;
    Button sendButton;

    MessageListener listener;
    MessageTransmitter mt;

    public static void main(String[] args) {
        launch(args);
        shahmirsChatroom screen = new shahmirsChatroom();
        screen.show();
    }

    @Override
    public void start(Stage primaryStage) {
        portEntry = new TextField();
        connect = new Button();
        disconnect = new Button();
        ipAddress = new TextField();
        textArea = new TextArea();
        chatText = new TextField();
        sendButton = new Button();
    }


    //Connect button functionality
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt){
        listener = new MessageListener(this, Integer.parseInt(portEntry.getText()));
        listener.start();
    }

    //Send button functionality
    private void sendButtonActionPerformed(java.awt.event.ActionEvent.evt){
        mt = new MessageTransmitter(chatText.getText(), ipAddress.getText(), Integer.parseInt(portEntry.getText()));
        mt.start();
    }


    @Override
    public void write(String s) {
        textArea.appendText(s + System.lineSeparator());
    }
}
