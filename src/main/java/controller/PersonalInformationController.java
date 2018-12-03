/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * PersonalInformationController.java
 * Created at 15:46 ~ 16/11/2018 by Bùi Trung Hiếu
 */
package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 15:46 ~ 16/11/2018
 */
public class PersonalInformationController extends BaseController implements Initializable {
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
            fxml = FXMLUtils.load(Constants.FXML_PERSONAL_INFORMATION);
            return fxml;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override public void initialize(URL location, ResourceBundle resources) {
        back(back);
    }
}
