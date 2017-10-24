package tutorme;

import UI.Login.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main GUI application class that is run when the program starts. The main FXML file is loaded up and the start
 * screen is displayed when the application starts.
 */
public class TutorMe extends Application {


    /* ************************************************************************* *
     *                                                                           *
     * Instance Variables                                                        *
     *                                                                           *
     * ************************************************************************  */

    /**
     * A framed window that contains all scenes
     */
    public Stage window;

    /**
     * A panel inside the window that contains all the GUI components
     */
    public Scene scene;


    /* ************************************************************************* *
     *                                                                           *
     * Constructors                                                              *
     *                                                                           *
     * ************************************************************************  */

    public TutorMe() {
    }


    /* ************************************************************************* *
     *                                                                           *
     * Instance Methods                                                          *
     *                                                                           *
     * ************************************************************************  */

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        /* Create a scene with the Main TutorMe as the root, and set the window to display the scene */
        //HomeController tutor_me_controller = new HomeController();
        //tutor_me_controller.display();

        /* TODO: Display the login screen first */
        LoginController login_controller = new LoginController();
        login_controller.display();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
