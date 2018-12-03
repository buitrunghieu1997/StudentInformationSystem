/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * BaseController.java
 * Created at 18:30 ~ 27/10/2018 by buitr
 */

package controller;

import application.Index;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 18:30 ~ 27/10/2018
 */
public class BaseController {

    /**
     * Back to dashboard
     * @param back @FXML id of Back Button
     */
    void back(Button back) {
        back.setOnMouseClicked(e -> {
            VBox mainContainer = (VBox) back.getScene().lookup("#mainContainer");
            MainMenuController.reloadView(mainContainer);
        });
    }

    /**
     * Close app.
     *
     * @param event the event
     */
    @FXML
    void closeApp(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void hideApp(MouseEvent event) {
        Index.getStage().setIconified(true);
    }
}
