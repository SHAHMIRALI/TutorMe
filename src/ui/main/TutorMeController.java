package ui.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * Controls the main GUI of the application. Makes sure that all components in the FXML (GUI) are associated with their
 * individual Controllers.
 */
public class TutorMeController extends AnchorPane{


    /* ************************************************************************* *
     *                                                                           *
     * Instance Variables                                                        *
     *                                                                           *
     * ************************************************************************  */

    /* File Explorer GUI Variables */
    @FXML
    private Button button;


    /* ************************************************************************* *
     *                                                                           *
     * Constructors                                                              *
     *                                                                           *
     * ************************************************************************  */

    public TutorMeController(){

    }

    public void display(){

        Stage window = new Stage();

        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ui/Main/tutorme.fxml"));
            window.setTitle("TutorMe");
            Scene scene = new Scene(root, 982, 534);
            window.setScene(scene);
            window.setResizable(true);
            window.setMaximized(true);
            //window.getIcons().add(new Image("/resources/tutorme_icon.png"));
            window.show();
        }catch (Exception ignored){}
    }

}
