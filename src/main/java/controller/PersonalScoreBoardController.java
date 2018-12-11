/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * PersonalScoreBoardController.java
 * Created at 19:39 ~ 08/12/2018 by Bùi Trung Hiếu
 */
package controller;

import entities.TblVPersonalscoreboard;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import logics.impl.StudentLogicImpl;
import utils.Constants;
import utils.FXMLUtils;

import javax.persistence.Table;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 19:39 ~ 08/12/2018
 */
public class PersonalScoreBoardController implements Initializable {
	@FXML
	TextField idStudentTxt;
	@FXML
	TableView<TblVPersonalscoreboard> table;
	@Override public void initialize(URL location, ResourceBundle resources) {
		initializeTable();
		addItem(getData());
	}
	
	/**
	 * Load fxml parent.
	 *
	 * @return the parent
	 */
	static Parent loadFXML() {
		Parent fxml;
		try {
			fxml = FXMLUtils.load(Constants.FXML_PERSONAL_SCOREBOARD);
			return fxml;
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

		TableColumn<TblVPersonalscoreboard, String> semesterCol= new TableColumn<>("Học kì");
		TableColumn<TblVPersonalscoreboard,String> idSubjectCol=new TableColumn<>("Mã học phần");
		TableColumn<TblVPersonalscoreboard,String> nameSubjectCol=new TableColumn<>("Tên học phần");
		TableColumn<TblVPersonalscoreboard,String> creditSubjectCol=new TableColumn<>("Tín chỉ");
		TableColumn<TblVPersonalscoreboard,String> classCodeCol=new TableColumn<>("Mã lớp");
		TableColumn<TblVPersonalscoreboard,String> midSemPointCol=new TableColumn<>("Điểm quá trình");
		TableColumn<TblVPersonalscoreboard,String> finalSemPointCol=new TableColumn<>("Điểm cuối kì");

		semesterCol.setCellValueFactory(cellData-> new SimpleStringProperty(cellData.getValue().getSemester()));
		idSubjectCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getIdSubject()));
		nameSubjectCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getName()));
		creditSubjectCol.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getCreditSubject())));
		classCodeCol.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getClassCode()));
		midSemPointCol.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getMidSemPoint())));
		finalSemPointCol.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getFinalSemPoit())));

		table.getColumns().addAll(semesterCol,idSubjectCol,nameSubjectCol,creditSubjectCol,classCodeCol,midSemPointCol,finalSemPointCol);
	}

	/**
	 * Phương thức dùng để thêm dữ liệu vào bảng
	 * @param personalScore
	 */
	private void addItem(ArrayList<TblVPersonalscoreboard> personalScore){
		table.getItems().addAll(personalScore);
	}
	/**
	 * Phương thức này dùng để load dữ liệu từ logic
	 */
	private ArrayList<TblVPersonalscoreboard> getData(){
		String idStudent=idStudentTxt.getText();
		return (ArrayList)new StudentLogicImpl().displayPersonalScoreboard(Integer.valueOf(idStudent));
	}

}
