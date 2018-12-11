/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * StudentListController.java
 * Created at 18:02 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 18:02 ~ 09/12/2018
 */
public class StudentListController implements Initializable {
	@FXML JFXComboBox yearCombo;
	@FXML JFXComboBox departmentCombo;
	@FXML TextField   classIdTxt;
	@FXML TextField   studentTxtId;
	@FXML TextField   nameTxt;
	@FXML Button      search;
	@FXML Button      back;
	@FXML TableView   table; // cần chỉ rõ xem entity là gì vs TableView<Student> thì mới mapping được
	
	/**
	 * Load fxml parent.
	 *
	 * @return the parent
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_STUDENT_LIST);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Called to initialize a controller after its root element has been
	 * completely processed.
	 *
	 * @param location  The location used to resolve relative paths for the root object, or
	 *                  <tt>null</tt> if the location is not known.
	 * @param resources The resources used to localize the root object, or <tt>null</tt> if
	 */
	@Override public void initialize(URL location, ResourceBundle resources) {
	
	}
}
