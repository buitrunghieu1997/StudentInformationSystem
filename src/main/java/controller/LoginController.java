/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * LoginController.java
 * Created at 10:50 ~ 27/10/2018 by buitr
 */

package controller;

import assets.transitions.FadeTransition;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr  Created: 10:50 ~ 27/10/2018
 */
public class LoginController extends BaseController implements Initializable {

    @FXML
    private MaterialDesignIconView cross;
    @FXML
    private AnchorPane parent;
    private static LoginController instance;

    static LoginController getInstance() {
        if(instance == null) {
            instance = new LoginController();
        }
        return instance;
    }

    @Override public void initialize(URL location, ResourceBundle resources) {
        Parent               fxml     = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
            ObservableList<Node> children = parent.getChildren();
            children.removeAll();
            children.setAll(fxml);
        } catch (IOException e) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
