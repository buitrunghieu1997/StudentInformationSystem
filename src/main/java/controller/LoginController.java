/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, controller - IntelliJ IDEA
 * LoginController.java
 * Created at 10:50 ~ 27/10/2018 by buitr
 */

package controller;

import application.Index;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import logics.impl.AccountLogicImpl;
import utils.Constants;
import utils.FXMLUtils;
import validate.LoginValidate;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr Created: 10:50 ~ 27/10/2018
 */
public class LoginController extends BaseController implements Initializable {
	private static Stage     stage;
	@FXML private  TextField usernameTxt;
	@FXML private  TextField passwordTxt;
	@FXML          Button    signInBtn;
	
	
	/**
	 * Getter for property 'stage'.
	 *
	 * @return Value for property 'stage'.
	 */
	public static Stage getStage() {
		return stage;
	}
	
	/**
	 * Setter for property 'stage'.
	 *
	 * @param stage Value to set for property 'stage'.
	 */
	public static void setStage(Stage stage) {
		LoginController.stage = stage;
	}
	
	public static void loadFXML(AnchorPane parent) throws IOException {
		Parent               fxml     = FXMLUtils.load(Constants.FXML_LOGIN);
		ObservableList<Node> children = parent.getChildren();
		children.removeAll();
		children.setAll(fxml);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		stage = Index.getStage();
		signInBtn.setOnMouseClicked(event -> signIn());
	}
	
	/**
	 * Sign in.
	 */
	@FXML
	void signIn() {
		String userName = usernameTxt.getText();
		String password = passwordTxt.getText();
		if (!new LoginValidate().loginValidate(userName, password)) {
			//Hiển thị thông báo
			//TODO
			System.out.println("chua nhap user name vs password");
		} else {
			if (new AccountLogicImpl().login(userName, password)) {
				switchScene();
			} else {
				//Hiển thị thông báo đăng nhập sai
				//TODO
				System.out.println("Tai khoan hoac mat khau bi nhap sai");
			}
		}
	}
	
	private void switchScene() {
		try {
			Index.getStage().hide();
			MainMenuController.loadFXML();
		} catch (IOException e) {
			Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, this.getClass().getName(), e);
		}
	}
	
}
