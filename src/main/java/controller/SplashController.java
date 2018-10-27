/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SplashController.java, 22/10/2018 Trung Hieu Bui (Mr)
 */
package controller;

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
import views.transitions.FadeTransition;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class SplashController implements Initializable {

    @FXML
    private AnchorPane parent;

    @FXML
    private MaterialDesignIconView cross;

    /** {@inheritDoc} */
    @Override public void initialize(URL location, ResourceBundle resources) {
        FadeTransition.applyFadeTransition(parent, Duration.seconds(5), (EventHandler<ActionEvent>) event -> {
            try {
                Parent fxml = FXMLLoader.load(getClass().getResource("../../resources/views/splash.fxml"));
                ObservableList<Node> children = parent.getChildren();
                children.removeAll();
                children.setAll(fxml);
            } catch (IOException e) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, e);
            }
        }, 0.2, 1, 1,true);
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
