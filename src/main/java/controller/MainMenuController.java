/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * MainMenuController.java
 * Created at 22:14 ~ 28/10/2018 by buitr
 */

package controller;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr Created: 22:14 ~ 28/10/2018
 */
public class MainMenuController extends BaseController implements Initializable {
    private Stage      stage;
    @FXML
    private BorderPane parent;
    private double     xOffset = 0;
    private double     yOffset = 0;

    @FXML
    private TitledPane ui, pr, sc, sr, rs, lu;

    @FXML
    private HBox db;

    @FXML
    private TextField searchbox;

    @FXML
    private Button setting, noti;

    @FXML
    private MenuButton dropdown;

    @FXML
    private FontAwesomeIconView logo;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stage = LoginController.getStage();
        makeStageDraggable();
        db.setOnMouseClicked(e -> {
            collapseAll();
        });

        Platform.runLater(() -> {
            addDoubleClickEvent();
        });
    }

    private void makeStageDraggable() {
        parent.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
            xOffset = e.getSceneX();
            yOffset = e.getSceneY();
        });

        parent.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
            stage.setX(e.getScreenX() - xOffset);
            stage.setY(e.getScreenY() - yOffset);
            stage.setOpacity(0.7f);
        });

        parent.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> stage.setOpacity(1.0f));

        parent.setOnDragDone(e -> stage.setOpacity(1.0f));
    }

    private void collapseAll() {
        ui.setExpanded(false);
        pr.setExpanded(false);
        sc.setExpanded(false);
        sr.setExpanded(false);
        rs.setExpanded(false);
        lu.setExpanded(false);
    }

    private void addDoubleClickEvent() {
        stage.getScene().setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2) {
                stage.setFullScreen(true);
            }
        });
    }
}
