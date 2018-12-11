/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * ToeicScoreBoardController.java
 * Created at 18:02 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package controller;

import entities.TblVToeic;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import logics.impl.ToeicLogicImpl;
import utils.Constants;
import utils.FXMLUtils;
import validate.ToeicValidate;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 18:02 ~ 09/12/2018
 */
public class ToeicScoreBoardController implements Initializable {
	@FXML TextField            studentTxtId;
	@FXML ComboBox<String>     semesterCombo;
	@FXML TextField            subjectTxt;
	@FXML Button               search;
	@FXML Button               back;
	@FXML TableView<TblVToeic> table;
	/**
	 * Called to initialize a controller after its root element has been
	 * completely processed.
	 *
	 * @param location  The location used to resolve relative paths for the root object, or
	 *                  <tt>null</tt> if the location is not known.
	 * @param resources The resources used to localize the root object, or <tt>null</tt> if
	 */
	@Override public void initialize(URL location, ResourceBundle resources) {
		initializeTable();

		search.setOnMouseClicked(event -> clickSearch());
	}
	/**
	 * Load Fxml follow the path
	 *
	 * @return loaded fxml
	 * @throws IOException the io exception
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_TOEIC_SCOREBOARD);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Phương thức này dùng để khởi tạo bảng
	 */
	private void initializeTable(){
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<TblVToeic,String> idStudentCol=new TableColumn<>("Mã số sinh viên");
		TableColumn<TblVToeic,String> nameCol=new TableColumn<>("Họ tên");
		TableColumn<TblVToeic,String> dateOfBirthCol=new TableColumn<>("Ngày sinh");
		TableColumn<TblVToeic,String> semesterCol=new TableColumn<>("Học kì");
		TableColumn<TblVToeic,String> dateCol=new TableColumn<>("Ngày thi");
		TableColumn<TblVToeic,String> pointCol=new TableColumn<>("Điểm thi");

		idStudentCol.setCellValueFactory(cellData-> new SimpleStringProperty(String.valueOf(cellData.getValue().getIdStudent())));
		nameCol.setCellValueFactory(cellData-> new SimpleStringProperty(cellData.getValue().getFullName()));
		dateOfBirthCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getDateOfBirth()));
		semesterCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getSemester()));
		dateCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getDate()));
		pointCol.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getPoint())));
		table.getColumns().addAll(idStudentCol,nameCol,dateOfBirthCol,semesterCol,dateCol,pointCol);
	}

	/**
	 * Phương thức này dùng để thêm dữ liệu vào bảng
	 * @param dataToeic dữ liệu điểm toeic cần được thêm vào bảng
	 */
	private void addItem(ArrayList<TblVToeic> dataToeic){
		table.getItems().addAll(dataToeic);
	}

	/**
	 * Hàm load dữ liệu từ logic
	 * @return
	 */
	private ArrayList<TblVToeic> getData(){
		String idStudent= studentTxtId.getText();
		ArrayList<TblVToeic> dataToeic = new ArrayList<>();
		TblVToeic toeic=new ToeicLogicImpl().searchToeic(Integer.valueOf(idStudent));
		dataToeic.add(toeic);
		return dataToeic;
	}

	/**
	 * Hàm bắt sự kiện khi button tìm kiếm được click
	 */
	public void clickSearch(){
		table.getItems().clear();
		String idStudent=studentTxtId.getText();
		if(new ToeicValidate().checkIdStudent(idStudent)){
			//Hiển thị thông báo chưa nhập mã số sinh viên
		}else if(!new ToeicValidate().checkTypeIdStudent(idStudent)){
			//Hiển thị thông báo nhập số vào ô mã số sinh viên
		}else{
			ArrayList<TblVToeic> listToeic= getData();
			addItem(listToeic);
		}
	}
}
