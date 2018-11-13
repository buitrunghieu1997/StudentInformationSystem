/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * ChangePasswordController.java
 * Created at 12:42 ~ 05/11/2018 by buitr
 */

package controller;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import utils.FXMLUtils;

import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 12:42 ~ 05/11/2018
 */
public class ChangePasswordController extends BaseController implements Initializable {

    @FXML
    private Button back;

    /**
     * Load fxml parent.
     *
     * @return the parent
     */
    static Parent loadFXML() {
        Parent fxml;
        try {
            fxml = FXMLUtils.load("../views/change-password.fxml");
            return fxml;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        back.setOnMouseClicked(e -> {
            VBox mainContainer = (VBox) back.getScene().lookup("#mainContainer");
            MainMenuController.reloadView(mainContainer);
        });
    }
}
