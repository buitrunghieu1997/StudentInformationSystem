package application; /**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 15:54 ~ 27/10/2018
 */

import controller.SplashController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro8.JMetro;

/**
 * The type fxml.Index.
 */
public class Index extends Application {
    /**
     * The constant stage.
     * để có thể truy cập và thay đổi stage sau dó
     */
    private static Stage stage = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(Stage primaryStage) {
	    setStage(primaryStage);
	    Parent root  = SplashController.loadFxml();
	    Scene  scene = new Scene(root);
	    primaryStage.setScene(scene);
	    primaryStage.initStyle(StageStyle.UNDECORATED);
	    primaryStage.show();
    }

    /**
     * Getter for property 'stage'.
     *
     * @return Value for property 'stage'.
     */
    public static Stage getStage() {
        return stage;
    }

    /**
     * Setter for property 'stage'.
     *
     * @param stage Value to set for property 'stage'.
     */
    public static void setStage(Stage stage) {
        Index.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
