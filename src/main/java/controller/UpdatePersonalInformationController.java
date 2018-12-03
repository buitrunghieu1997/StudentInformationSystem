/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, controller - IntelliJ IDEA
 * UpdatePersonalInformationController.java
 * Created at 09:41 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import utils.Constants;
import utils.FXMLUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:41 ~ 22/11/2018
 */
public class UpdatePersonalInformationController extends BaseController implements Initializable {
    @FXML private Button back;
    @FXML private Button confirm;

    /**
     * Load Fxml follow the path
     *
     * @return loaded fxml
     * @throws IOException the io exception
     */
    static Parent loadFXML() throws IOException {
        return FXMLUtils.load(Constants.FXML_UPDATE_PERSONAL_INFORMATION);
    }

    /**
     * Hàm được gọi sau khi khởi tạo OBj và các tài nguyên đã sẵn sàng
     *
     * @param location  nơi mà nó được load đến
     * @param resources các tài nguyên nó cần load
     */
    @Override public void initialize(URL location, ResourceBundle resources) {

    }
}
