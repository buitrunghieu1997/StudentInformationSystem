/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SubjectCategoryController.java
 * Created at 08:39 ~ 04/12/2018 by Bùi Trung Hiếu
 */
package controller;

import com.jfoenix.controls.JFXComboBox;
import entities.TblDepartment;
import entities.TblVSubject;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 08:39 ~ 04/12/2018
 */
public class SubjectCategoryController extends BaseController implements Initializable {
	/**
	 * The Department combo.
	 */
	@FXML JFXComboBox<TblDepartment> departmentCombo;
	/**
	 * The Subject id txt.
	 */
	@FXML TextField                  subjectIdTxt;
	/**
	 * The Subject name txt.
	 */
	@FXML TextField                  SubjectNameTxt;
	/**
	 * The Table.
	 */
	@FXML TableView<TblVSubject>     tableSC;
	/**
	 * The Search.
	 */
	@FXML Button                     search;
	/**
	 * The Back.
	 */
	@FXML Button                     back;
	
	/**
	 * Load fxml parent.
	 *
	 * @return the parent
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_SUBJECT_CATEGORY);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override public void initialize(URL location, ResourceBundle resources) {
		initializeTable();
		addItems(getData());
	}
	
	/**
	 * Khởi tạo bảng danh mục học phần
	 */
	private void initializeTable() {
		tableSC.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		TableColumn<TblVSubject, String> idCol   = new TableColumn<>("Subject ID");
		TableColumn<TblVSubject, String> subCol  = new TableColumn<>("Subject Name");
		TableColumn<TblVSubject, String> depCol  = new TableColumn<>("Department Name");
		TableColumn<TblVSubject, String> genCol  = new TableColumn<>("Genre Name");
		TableColumn<TblVSubject, String> lenCol  = new TableColumn<>("Class Name");
		TableColumn<TblVSubject, String> cSubCol = new TableColumn<>("Subject Credit");
		TableColumn<TblVSubject, String> cTuiCol = new TableColumn<>("Tuition Credit");
		TableColumn<TblVSubject, String> cofCol  = new TableColumn<>("Subject Id");
		
		
		idCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdSubject()));
		subCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNameSubject()));
		genCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGenreName()));
		depCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDepartmentName()));
		lenCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getLength())));
		cSubCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCreditSubject())));
		cTuiCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCreditTuition())));
		cofCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getWeight())));
		tableSC.getColumns().addAll(idCol, subCol, genCol, depCol, lenCol, cSubCol, cTuiCol, cofCol);
	}
	
	/**
	 * Add data to tableSC
	 *
	 * @param subjectcategories listdata
	 */
	private void addItems(ArrayList<TblVSubject> subjectcategories) {
		tableSC.getItems().addAll(subjectcategories);
	}
	
	/**
	 * Hàm lấy data từ logic
	 *
	 * @return
	 */
	private ArrayList<TblVSubject> getData() {
		// test
		ArrayList<TblVSubject> listTest = new ArrayList<>();
		TblVSubject            test1    = new TblVSubject();
		test1.setIdSubject("IT4440");
		test1.setNameSubject("Tương tác người máy");
		test1.setLength(16);
		test1.setCreditTuition(5);
		test1.setCreditSubject(3);
		test1.setWeight(0.7);
		test1.setGenreName("Bộ môn Công nghệ Phần mềm");
		test1.setDepartmentName("Viện Công nghệ Thông tin và Truyền Thông");
		
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		// end test
		
		// simple as logic.TblVSubject();
		return listTest;
	}
}
