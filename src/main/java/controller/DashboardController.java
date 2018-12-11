/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * DashboardController.java
 * Created at 09:07 ~ 14/11/2018 by Bùi Trung Hiếu
 */
package controller;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import org.jboss.logging.Logger.Level;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:07 ~ 14/11/2018
 */
public class DashboardController extends BaseController implements Initializable {

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
            fxml = FXMLUtils.load(Constants.FXML_DASHBOARD);
            
            return fxml;
        } catch (IOException e) {
            Logger.getLogger("DASHBOARD_CONTROLLER").warning(Arrays.toString(e.getStackTrace()));
        }
        return null;
    }
}
