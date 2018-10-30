/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, __test__ - IntelliJ IDEA
 * TestLogin.java
 * Created at 00:14 ~ 29/10/2018 by buitr
 */

package __test__;/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 00:14 ~ 29/10/2018
 */

import application.Index;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root  = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
            Scene  scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
        } catch (IOException e) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, Index.class.getName(), e);
        }
    }
}
