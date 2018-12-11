/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SubjectScoreBoardController.java
 * Created at 18:00 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package controller;

import entities.TblVPersonalscoreboard;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
 * @author Bùi Trung Hiếu  Created: 18:00 ~ 09/12/2018
 */
public class SubjectScoreBoardController implements Initializable {
	@FXML TextField                         studentTxtId;
	@FXML ComboBox<String>                  semesterCombo;
	@FXML TextField                         subjectTxt;
	@FXML Button                            search;
	@FXML Button                            back;
	@FXML TableView<TblVPersonalscoreboard> table;
	
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
	
	/**
	 * Load Fxml follow the path
	 *
	 * @return loaded fxml
	 * @throws IOException the io exception
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_SUBJECT_SCOREBOARD);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
