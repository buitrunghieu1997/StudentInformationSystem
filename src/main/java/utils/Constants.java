/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, app.java.utils - IntelliJ IDEA
 * Constants.java, 19/10/2018 Trung Hieu Bui (Mr)
 */
package utils;

/**
 * Include the whole constants
 *
 * @author Trung Hieu Bui (Mr)
 */
public class Constants {
	
	public static final String FXML_SPLASH                      = "../fxml/splash.fxml";
	public static final String EMPTY_STRING                     = "";
	public static final double ZERO_DOUBLE                      = 0.0;
	public static final String USERNAME                         = "root";
	public static final String PASSWORD                         = "critical";
	public static final int    CREATED                          = 1;
	public static final int    UPDATE                           = 2;
	public static final int    DELETED                          = -1;
	public static final int    BANNED                           = -2;
	public static final int    EXPIRED                          = -3;
	public static final int    HANDLING                         = 0;
	public static final int    DO_NOT_SHOW                      = 9999;
	public static final String MAIN_CONTAINER                   = "#mainContainer";
	public static final String UPDATE_PERSONAL_INFORMATION      = "1";
	public static final String SPLASH                           = "2";
	public static final String CHANGE_PASSWORD                  = "3";
	public static final String DASHBOARD                        = "4";
	public static final String LOGIN                            = "5";
	public static final String MAIN_MENU                        = "6";
	public static final String PERSONAL_INFORMATION             = "7";
	public static final String TIMETABLE                        = "8";
	//Class Status
	public static final int    CLASS_OPEN                       = 1;
	public static final int    CLASS_CLOSE                      = 0;
	public static final int    CLASS_CANCEL                     = -1;
	public static final int    CLASS_WAIT                       = 2;
	// Permission Status
	public static final String PERMISSION_EXPIRE                = "Expired";
	public static final String PERMISSION_INACTIVE              = "Inactive";
	public static final String PERMISSION_ACTIVE                = "Active";
	//Gender
	public static final int    MALE                             = 1;
	public static final int    FEMALE                           = 2;
	public static final int    OTHER                            = 0;
	public static final String FXML_UPDATE_PERSONAL_INFORMATION = "../fxml/update-personal-information.fxml";
	public static final String FXML_CHANGE_PASSWORD             = "../fxml/change-password.fxml";
	public static final String FXML_DASHBOARD                   = "../fxml/dashboard.fxml";
	public static final String FXML_LOGIN                       = "../fxml/login.fxml";
	public static final String FXML_MAIN_MENU                   = "../fxml/main_menu.fxml";
	public static final String FXML_PERSONAL_INFORMATION        = "../fxml/personal-information.fxml";
	public static final String FXML_TIMETABLE                   = "../fxml/time-table.fxml";
	public static final String FXML_SUBJECT_CATEGORY            = "../fxml/subject-category.fxml";
	public static final String FXML_PERSONAL_SCOREBOARD         = "../fxml/personal-scoreboard.fxml";
	public static final String FXML_SUBJECT_SCOREBOARD          = "../fxml/subject-scoreboard.fxml";
	public static final String FXML_STUDENT_LIST                = "../fxml/student-list.fxml";
	public static final String FXML_SUBJECT_REGISTER            = "../fxml/subject-register.fxml";
	public static final String FXML_CLASS_REGISTERED_LOOKUP     = "../fxml/class-registered-lookup.fxml";
	public static final String FXML_TOEIC_SCOREBOARD            = "../fxml/toeic-scoreboard.fxml";
	public static final String EXCEL_WORKBOOK_LOCATION          = ".sql/ExcelData/18bangdata.xlsx";
	public static final String SUBJECT_REGISTER                 = "subjectregister";
	public static final String DETAIL_SUBJECT_REGISTER          = "detailsubjectregister";
	public static final String DETAIL_LEARNING_CHART            = "detaillearningchart";
	public static final String SUBJECT                          = "Subject";
	public static final String TOEIC                            = "Toeic";
	public static final String LEARNING_CHART                   = "Learningchart";
	public static final String GENRE                            = "genre";
	public static final String SCHEDULE                         = "Schedule";
	public static final String DETAIL_REGISTER_CLASS            = "detailregisterclass";
	public static final String REGISTER_CLASS                   = "Registerclass";
	public static final String PROGRAM                          = "program";
	public static final String DEPARTMENT                       = "department";
	public static final String MANAGER                          = "manager";
	public static final String ACCOUNT                          = "account";
	public static final String PERIMISSION                      = "permission";
	public static final String STUDENT                          = "Student";
	public static final String DETAIL_PERMISSION                = "detailpermission";
	public static final String SUBJECT_PARENT                   = "subjectparent";
	
	public static final int MAX_CREDIT_REGISTER = 24;
	
	private Constants() {
	}
}
