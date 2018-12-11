/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * SubjectRegisterController.java
 * Created at 18:05 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package controller;

import com.jfoenix.controls.JFXComboBox;
import entities.TblSubject;
import entities.TblSubject;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 18:05 ~ 09/12/2018
 */
public class SubjectRegisterController implements Initializable {
	@FXML JFXComboBox<String>   semesterCombo;
	@FXML TextField             subjectIdTxt;
	@FXML Button                register;
	@FXML Button                delete;
	@FXML Button                submit;
	@FXML Button                back;
	@FXML TableView<TblSubject> table;
	
	/**
	 * Load fxml parent.
	 *
	 * @return the parent
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_SUBJECT_REGISTER);
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
		// Tìm kiếm tài liệu load một checkbox vào một cột để chọn bỏ chọn học phần
	}
	/**
	 * Khởi tạo bảng danh mục học phần
	 */
	private void initializeTable() {
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		TableColumn<TblSubject, String> idCol   = new TableColumn<>("Subject ID");
		TableColumn<TblSubject, String> subCol  = new TableColumn<>("Subject Name");
		TableColumn<TblSubject, String> regCol  = new TableColumn<>("Registered Time");
		TableColumn<TblSubject, String> sttCol  = new TableColumn<>("Status");
		TableColumn<TblSubject, String> cSubCol = new TableColumn<>("Subject Credit");
		
		idCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdSubject()));
		subCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		regCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTimeModified()));
		cSubCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCreditSubject())));
	}
	
	/**
	 * Add data to table
	 *
	 * @param subjectcategories listdata
	 */
	private void addItems(ArrayList<TblSubject> subjectcategories) {
//		table.getItems().addAll(subjectcategories);
	}
	
	/**
	 * Hàm lấy data từ logic
	 *
	 * @return
	 */
	private ArrayList<TblSubject> getData() {
		// test
		ArrayList<TblSubject> listTest = new ArrayList<>();
		TblSubject            test1    = new TblSubject();
		test1.setIdSubject("IT4440");
//		test1.setNameSubject("Tương tác người máy");
//		test1.setLength(16);
//		test1.setCreditTuition(5);
//		test1.setCreditSubject(3);
//		test1.setWeight(0.7);
//		test1.setGenreName("Bộ môn Công nghệ Phần mềm");
//		test1.setDepartmentName("Viện Công nghệ Thông tin và Truyền Thông");
		
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		// end test
		
		// simple as logic.TblSubject();
		return listTest;
	}
	
}
