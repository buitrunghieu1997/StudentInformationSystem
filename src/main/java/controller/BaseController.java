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
import javafx.scene.input.MouseEvent;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 18:30 ~ 27/10/2018
 */
public class BaseController {

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
    void hideApp (MouseEvent event) {
        Index.getStage().setIconified(true);
    }
}
