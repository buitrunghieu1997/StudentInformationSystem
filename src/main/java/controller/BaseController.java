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
}
