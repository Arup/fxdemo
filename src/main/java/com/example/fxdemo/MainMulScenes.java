package com.example.fxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMulScenes extends Application  {

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Label lbl1 = new Label("Welcome to the 1st scene");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(e->window.setScene(scene2));

        VBox lay1 = new VBox(20);
        lay1.getChildren().addAll(lbl1,button1);
        scene1 = new Scene(lay1, 200, 200);

        Button btn2 = new Button("This is second secene, lets go back to scene1");
        btn2.setOnAction(e->window.setScene(scene1));

        StackPane lay2 = new StackPane();
        lay2.getChildren().add(btn2);
        scene2 = new Scene(lay2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Test");
        window.show();

    }

}
