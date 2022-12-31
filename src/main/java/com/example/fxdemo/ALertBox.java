package com.example.fxdemo;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
/*
https://www.youtube.com/watch?v=BY-4ONH0DFE&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG&index=28&ab_channel=thenewboston
 */
public class ALertBox {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.WINDOW_MODAL);
        window.setTitle("Test");
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button(("Close the window"));
        closeButton.setOnAction(e->window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}

