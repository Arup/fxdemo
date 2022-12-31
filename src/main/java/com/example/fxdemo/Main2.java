package com.example.fxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application  {

    Button btn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Test");
        btn = new Button();
        btn.setText("Click me");
        btn.setOnAction(e-> System.out.println("hey now brown cow"));

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        Scene sc = new Scene(layout, 200,200);
        stage.setScene(sc);
        stage.show();

    }

}
