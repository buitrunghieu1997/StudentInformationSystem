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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import assets.transitions.FadeTransition;
import application.Index;

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
public class SplashController extends BaseController implements Initializable {

    @FXML
    private AnchorPane parent;
    private double     xOffset = 0;
    private double     yOffset = 0;

    @FXML
    private MaterialDesignIconView cross;

    /**
     * {@inheritDoc}
     */
    @Override public void initialize(URL location, ResourceBundle resources) {
        makeStageDraggable();
        FadeTransition.applyFadeTransition(parent, Duration.seconds(5), (EventHandler<ActionEvent>) event -> {
            try {
                Parent               fxml     = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
                ObservableList<Node> children = parent.getChildren();
                children.removeAll();
                children.setAll(fxml);
            } catch (IOException e) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, e);
            }
        }, 0.5, 1, 1, true);
    }

    private void makeStageDraggable() {
        Stage stage = Index.getStage();
        parent.setOnMousePressed(e -> {
            xOffset = e.getSceneX();
            yOffset = e.getSceneY();
        });
        parent.setOnMouseDragged(e -> {
            stage.setX(e.getScreenX() - xOffset);
            stage.setY(e.getScreenY() - yOffset);
            stage.setOpacity(0.7f);
        });
        parent.setOnDragDone(e -> {
            stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased(e -> {
            stage.setOpacity(1.0f);
        });
    }
}
