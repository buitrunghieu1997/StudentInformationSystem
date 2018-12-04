/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * TimetableController.java
 * Created at 09:25 ~ 29/11/2018 by Bùi Trung Hiếu
 */
package controller;

import entities.TblVSchedule;
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
 * @author Bùi Trung Hiếu  Created: 09:25 ~ 29/11/2018
 */
public class TimetableController extends BaseController implements Initializable {
	@FXML Button                  confirm;
	@FXML Button                  back;
	@FXML TextField               input;
	@FXML TableView<TblVSchedule> table;
	
	/**
	 * Load Fxml follow the path
	 *
	 * @return loaded fxml
	 * @throws IOException the io exception
	 */
	static Parent loadFXML() {
		try {
			return FXMLUtils.load(Constants.FXML_TIMETABLE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Hàm được gọi sau khi khởi tạo OBj và các tài nguyên đã sẵn sàng
	 *
	 * @param location  nơi mà nó được load đến
	 * @param resources các tài nguyên nó cần load
	 */
	@Override public void initialize(URL location, ResourceBundle resources) {
		initializeTable();
		addItems(getData());
	}
	
	/**
	 * Khởi tạo bảng thòi khoá biểu
	 */
	private void initializeTable() {
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		TableColumn<TblVSchedule, String> timeCol      = new TableColumn<>("Time");
		TableColumn<TblVSchedule, String> weekCol      = new TableColumn<>("Week");
		TableColumn                       lengthCol    = new TableColumn<>("Length");
		TableColumn<TblVSchedule, String> classCodeCol = new TableColumn<>("Class Id");
		TableColumn                       groupCol     = new TableColumn<>("Group");
		TableColumn<TblVSchedule, String> idSubjectCol = new TableColumn<>("Subject Id");
		TableColumn<TblVSchedule, String> classNameCol = new TableColumn<>("Class Name");
		
		
		timeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTime()));
		weekCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStartWeek().toString()));
		classCodeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClassCode()));
		idSubjectCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdSubject()));
		classNameCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		table.getColumns().addAll(timeCol, weekCol, lengthCol, classCodeCol, groupCol, idSubjectCol, classNameCol);
	}
	
	/**
	 * Add data to table
	 *
	 * @param timetable listdata
	 */
	private void addItems(ArrayList<TblVSchedule> timetable) {
		table.getItems().addAll(timetable);
	}
	
	/**
	 * Hàm lấy data từ logic
	 *
	 * @return
	 */
	private ArrayList<TblVSchedule> getData() {
		// test
		ArrayList<TblVSchedule> listTest = new ArrayList<>();
		TblVSchedule            test1    = new TblVSchedule();
		test1.setClassCode("485460");
		test1.setIdStudent(20151295);
		test1.setIdSubject("IT4440");
		test1.setName("Tương tác người máy");
		test1.setRoom("TC-207");
		test1.setStartWeek(2);
		test1.setTime("Thứ 4, 14h15-17h35");
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		listTest.add(test1);
		// end test
		
		// simple as logic.getListVSchedule();
		return listTest;
	}
}
