/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SubjectCategoryController.java
 * Created at 08:39 ~ 04/12/2018 by Bùi Trung Hiếu
 */
package controller;

import com.jfoenix.controls.JFXComboBox;
import entities.TblDepartment;
import entities.TblSubject;
import entities.TblVSchedule;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
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
	@FXML TextField subjectIdTxt;
	/**
	 * The Subject name txt.
	 */
	@FXML TextField SubjectNameTxt;
	/**
	 * The Table.
	 */
	@FXML TableView<TblSubject> table;
	/**
	 * The Search.
	 */
	@FXML Button search;
	/**
	 * The Back.
	 */
	@FXML Button back;
	
	@Override public void initialize(URL location, ResourceBundle resources) {
	
	}
	
	/**
	 * Load fxml parent.
	 *
	 * @return the parent
	 */
	static Parent loadFXML() {
		Parent fxml;
		try {
			return FXMLUtils.load(Constants.FXML_SUBJECT_CATEGORY);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Khởi tạo bảng danh mục học phần
	 */
	private void initializeTable() {
//		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
//
//		TableColumn<TblVSchedule, String> timeCol      = new TableColumn<>("Time");
//		TableColumn<TblVSchedule, String> weekCol      = new TableColumn<>("Week");
//		TableColumn                       lengthCol    = new TableColumn<>("Length");
//		TableColumn<TblVSchedule, String> classCodeCol = new TableColumn<>("Class Id");
//		TableColumn                       groupCol     = new TableColumn<>("Group");
//		TableColumn<TblVSchedule, String> idSubjectCol = new TableColumn<>("Subject Id");
//		TableColumn<TblVSchedule, String> classNameCol = new TableColumn<>("Class Name");
//
//
//		timeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTime()));
//		weekCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStartWeek().toString()));
//		classCodeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClassCode()));
//		idSubjectCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdSubject()));
//		classNameCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
//		table.getColumns().addAll(timeCol, weekCol, lengthCol, classCodeCol, groupCol, idSubjectCol, classNameCol);
	}
	
	/**
	 * Add data to table
	 *
	 * @param timetable listdata
	 */
//	private void addItems(ArrayList<TblVSchedule> timetable) {
//		table.getItems().addAll(timetable);
//	}
	
	/**
	 * Hàm lấy data từ logic
	 *
	 * @return
	 */
//	private ArrayList<TblVSchedule> getData() {
//		// test
//		ArrayList<TblVSchedule> listTest = new ArrayList<>();
//		TblVSchedule            test1    = new TblVSchedule();
//		test1.setClassCode("485460");
//		test1.setIdStudent(20151295);
//		test1.setIdSubject("IT4440");
//		test1.setName("Tương tác người máy");
//		test1.setRoom("TC-207");
//		test1.setStartWeek(2);
//		test1.setTime("Thứ 4, 14h15-17h35");
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		listTest.add(test1);
//		// end test
//
//		// simple as logic.getListVSchedule();
//		return listTest;
//	}
}
