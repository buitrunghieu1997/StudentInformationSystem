/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * MainMenuController.java
 * Created at 22:14 ~ 28/10/2018 by buitr
 */

package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr Created: 22:14 ~ 28/10/2018
 */
public class MainMenuController extends BaseController implements Initializable {
	private static Stage      stage;
	@FXML
	private        BorderPane parent;
	private        double     xOffset = 0;
	private        double     yOffset = 0;
	@FXML
	private        TitledPane ui;
	@FXML
	private        TitledPane pr;
	@FXML
	private        TitledPane sc;
	@FXML
	private        TitledPane sr;
	@FXML
	private        TitledPane rs;
	@FXML
	private        TitledPane lu;
	@FXML
	private        HBox       db;
	@FXML
	private        HBox       cp;
	@FXML
	private        HBox       pi;
	@FXML
	private        HBox       tt;
	@FXML
	private        HBox       upi;
	
	@FXML
	private VBox mainContainer;
	
	private static void addDoubleClickEvent() {
		stage.getScene().setOnMouseClicked(event -> {
			if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2) {
				stage.setFullScreen(true);
			}
		});
	}
	
	/**
	 * Load fxml.
	 *
	 * @throws IOException the io exception
	 */
	static void loadFXML() throws IOException {
		Parent root  = FXMLUtils.load(Constants.FXML_MAIN_MENU);
		Scene  scene = new Scene(root);
		stage.setScene(scene);
		addDoubleClickEvent();
		stage.centerOnScreen();
		stage.initStyle(StageStyle.DECORATED);
		stage.setResizable(false);
		stage.show();
	}
	
	/**
	 * Load view trên mainContainer
	 *
	 * @param mainContainer Vbox chứa content cần thay thế
	 */
	static void reloadView(VBox mainContainer) {
		mainContainer.getChildren().clear();
		mainContainer.getChildren().addAll(DashboardController.loadFXML());
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
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		makeStageDraggable();
		stage = new Stage();
		
		db.setOnMouseClicked(e -> {
			collapseAll();
			reloadView(mainContainer);
		});
		cp.setOnMouseClicked(event -> {
			mainContainer.getChildren().clear();
			mainContainer.getChildren().addAll(ChangePasswordController.loadFXML());
		});
		pi.setOnMouseClicked(e -> {
			mainContainer.getChildren().clear();
			mainContainer.getChildren().addAll(PersonalInformationController.loadFXML());
		});
		upi.setOnMouseClicked(e -> {
			mainContainer.getChildren().clear();
			mainContainer.getChildren().addAll(UpdatePersonalInformationController.loadFXML());
		});
		tt.setOnMouseClicked(e -> {
			mainContainer.getChildren().clear();
			mainContainer.getChildren().addAll(TimetableController.loadFXML());
		});
	}
	
	
	/**
	 * Gets main container.
	 *
	 * @return the main container
	 */
	public VBox getMainContainer() {
		return mainContainer;
	}
}
