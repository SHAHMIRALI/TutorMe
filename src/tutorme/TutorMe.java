package tutorme;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.main.TutorMeController;

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
        TutorMeController tutorMeController = new TutorMeController();
//        scene = new Scene(tutorMeController, 700, 500);
//
//        window.setTitle("TutorMe");
//        window.setScene(scene);
//        window.setMaximized(true);

        /* Add the application icon to the window */
        //window.getIcons().add(new javafx.scene.image.Image("/resources/tutorme_icon.png"));

        tutorMeController.display();


        /* We do not display the main window. We first display the start screen window (which is separate) from where
        * the user can view the tutorial and then select the starting directory. The start screen will show this main
        * window once a directory has been chosen. */

        /* Display the start screen */
        //StartSceenController startSceen = new StartSceenController();
        //startSceen.display();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
