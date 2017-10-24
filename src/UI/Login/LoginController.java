package UI.Login;

import UI.Home.HomeController;
import javafx.event.ActionEvent;
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
public class LoginController extends AnchorPane{


    /* ************************************************************************* *
     *                                                                           *
     * Instance Variables                                                        *
     *                                                                           *
     * ************************************************************************  */

    /** EXAMPLE: btn_name is the button defined inside the associated view (fxml) and its "fx:id = btn_name" */
    @FXML
    private Button btn_name;

    /** The window in which the associated view is displayed */
    private Stage window;


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

        window = new Stage();

        try {

            /*
            Use FXMLLoader to connect the view_login.fxml file with this controller. Calling loader.load()
            will return the root (Parent) view of view_login.fxml. This following code will always be the
            same whenever initializing a Controller.

            NOTE: When accessing resources through getClass(), it directly accesses the folder this class is in
            */
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view_login.fxml"));
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
        }catch (Exception ignored){
            ignored.printStackTrace();
        }

        /* EXAMPLE: When btn_name is clicked, call the onBtnNameClicked method inside this class (lambda expression use) */
        btn_name.setOnAction(this::onBtnNameClicked);

    }


    /* ************************************************************************* *
     *                                                                           *
     * Instance Methods                                                          *
     *                                                                           *
     * ************************************************************************  */

    /**
     * <b>Action:</b> btn_name is clicked.
     *
     * <br><br>
     *
     * Closes the login window and displays the home window.
     *
     * @param e the event that happened
     */
    private void onBtnNameClicked(ActionEvent e){
        HomeController home_controller = new HomeController();
        window.close();
        home_controller.display();
    }

}
