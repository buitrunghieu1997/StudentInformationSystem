/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * LoginController.java
 * Created at 10:50 ~ 27/10/2018 by buitr
 */

package controller;

import application.Index;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr Created: 10:50 ~ 27/10/2018
 */
public class LoginController extends BaseController implements Initializable {
    private static Stage stage;

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
        LoginController.stage = stage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stage = new Stage();
    }

    private void switchScene() {
        try {
            Parent root  = FXMLUtils.load("../views/main_menu.fxml");
            Scene  scene = new Scene(root, 1000, 680);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.initStyle(StageStyle.DECORATED);
            Index.getStage().hide();
            stage.setFullScreen(true);
            stage.setResizable(false);
            addDoubleClickEvent();
            stage.show();
        } catch (IOException e) {
            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, this.getClass().getName(), e);
        }
    }

    /**
     * Sign in.
     *
     * @param event the event
     */
    @FXML
    void signIn(MouseEvent event) {
        if (true) {
            switchScene();
        }
    }

    private void addDoubleClickEvent() {
        stage.getScene().setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2) {
                stage.setFullScreen(true);
            }
        });
    }
}
