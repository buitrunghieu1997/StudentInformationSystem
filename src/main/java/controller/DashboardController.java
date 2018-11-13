/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * DashboardController.java
 * Created at 09:07 ~ 14/11/2018 by Bùi Trung Hiếu
 */
package controller;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:07 ~ 14/11/2018
 */
public class DashboardController implements Initializable {

    @Override public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * Load fxml parent.
     *
     * @return the parent
     */
    static Parent loadFXML() {
        Parent fxml;
        try {
            fxml = FXMLUtils.load("../views/dashboard.fxml");
            return fxml;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
