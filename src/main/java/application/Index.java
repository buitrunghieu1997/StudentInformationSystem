package application;

import controller.SplashController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 15:54 ~ 27/10/2018
 */
public class Index extends Application {
    /**
     * The constant stage.
     * để có thể truy cập và thay đổi stage sau dó
     */
    private static Stage stage = null;
	
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
	private static void setStage(Stage stage) {
		Index.stage = stage;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(Stage primaryStage) {
	    setStage(primaryStage);
	    Parent root  = SplashController.loadFxml();
	    if (root != null) {
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		    primaryStage.initStyle(StageStyle.UNDECORATED);
	    }
	    primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
