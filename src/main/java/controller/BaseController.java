/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * BaseController.java
 * Created at 18:30 ~ 27/10/2018 by buitr
 */

package controller;

import application.Index;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 18:30 ~ 27/10/2018
 */
public class BaseController {

    @FXML
    private MaterialDesignIconView cross;
    @FXML
    private FontAwesomeIconView    minimize;

    /**
     * Close app.
     *
     * @param event the event
     */
    @FXML
    void closeApp(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void hideApp (MouseEvent event) {
        Index.getStage().setIconified(true);
    }

    /**
     * Change style.
     *
     * @param event the event
     */
    @FXML
    void changeCrossIconStyle(MouseEvent event) {
        cross.setStyle("-fx-font-size: 25; -fx-fill: red;");
    }

    /**
     * Change style back.
     *
     * @param event the event
     */
    @FXML
    void changeCrossIconStyleBack(MouseEvent event) {
        cross.setStyle("-fx-font-size: 18; -fx-fill: white");
    }

    @FXML
    void changeMinimizeIconStyle() {
        minimize.setStyle("-fx-font-size: 18; -fx-fill: white;");
    }

    @FXML
    void changeMinimizeIconStyleBack() {
        minimize.setStyle("-fx-font-size: 14; -fx-fill: white;");
    }
}
