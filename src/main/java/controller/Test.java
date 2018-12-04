/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, controller - IntelliJ IDEA
 * Test.java, 23/10/2018 Trung Hieu Bui (Mr)
 */
package controller;/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label label = new Label("1st Label");
        Button button = new Button("Go =>");
        Button button1 = new Button("Alert");
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label, button, button1);
        scene1 = new Scene(layout1, 400, 600);

        Button button2 = new Button("<= Back");
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 400);

        button.setOnAction(event -> window.setScene(scene2));
        button1.setOnAction(event -> {
            Alert alert = new Alert(AlertType.INFORMATION, "Alert", ButtonType.APPLY);
            alert.show();
        });
        button2.setOnAction(event -> window.setScene(scene1));

        window.setScene(scene1);
        window.show();
    }
}
