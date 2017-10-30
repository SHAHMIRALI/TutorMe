package UI.shahmirsChatroom;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class shahmirsChatroom extends Application implements WritableGUI {

    TextField portEntry;
    Button connect;
    Button disconnect;
    TextField ipAddress;
    TextArea textArea;
    TextField chatText;
    Button sendButton;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }


    @Override
    public void write(String s) {

    }
}
