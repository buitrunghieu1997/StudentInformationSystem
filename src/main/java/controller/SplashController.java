/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SplashController.java, 22/10/2018 Trung Hieu Bui (Mr)
 */
package controller;

import animatefx.animation.Bounce;
import animatefx.animation.RollIn;
import application.Index;
import assets.transitions.FadeTransition;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
	    try {
		    makeStageDraggable();
		    LoginController.loadFXML(parent);
	    } catch (IOException e) {
		    e.printStackTrace();
	    }
        FadeTransition.applyFadeTransition(parent, Duration.seconds(2), event -> {
            try {
                LoginController.loadFXML(parent);
            } catch (IOException e) {
                e.printStackTrace();
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
    
    public static Parent loadFxml() {
        try {
            return FXMLUtils.load(Constants.FXML_SPLASH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
