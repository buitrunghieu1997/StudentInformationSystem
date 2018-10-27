/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * LoginController.java
 * Created at 10:50 ~ 27/10/2018 by buitr
 */

package controller;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 10:50 ~ 27/10/2018
 */
public class LoginController implements Initializable {

    @FXML
    private MaterialDesignIconView cross;

    @Override public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * Close app.
     *
     * @param event the event
     */
    @FXML
    void closeApp(MouseEvent event) {
        System.exit(0);
    }
}
