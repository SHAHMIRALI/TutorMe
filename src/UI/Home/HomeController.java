package UI.Home;

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
public class HomeController extends AnchorPane{


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

    /**
     * Self-defined constructor for this controller which displays the window and
     * initializes all its fxml elements. We use this instead of a normal constructor.
     */
    public void display(){

        Stage window = new Stage();

        try {

            /*
            Use FXMLLoader to connect the view_home.fxml file with this controller. Calling loader.load()
            will return the root (Parent) view of view_home.fxml. This following code will always be the
            same whenever initializing a Controller.

            NOTE: When accessing resources through getClass(), it directly accesses the folder this class is in
            */
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view_home.fxml"));
            loader.setController(this);
            Parent root = loader.load();

            /* Create a window and set up its various properties */
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
