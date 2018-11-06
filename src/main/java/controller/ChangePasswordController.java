/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * ChangePasswordController.java
 * Created at 12:42 ~ 05/11/2018 by buitr
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
 * @author buitr
 * Created: 12:42 ~ 05/11/2018
 */
public class ChangePasswordController extends BaseController implements Initializable {

    public static Parent loadFXML() {
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

    }
}
