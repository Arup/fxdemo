package com.example.fxdemo;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button btn;
    Scene scene;
    ListView<Integer> listView;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Test");
        btn = new Button();
        btn.setText("Click me");
        btn.setOnAction(e->buttonClicked());
        listView = new ListView<>();
        listView.getItems().addAll(5,4,7);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox layout = new VBox();
        layout.getChildren().addAll(listView,btn);

        Scene sc = new Scene(layout, 200,200);
        stage.setScene(sc);
        stage.show();

    }

   private void buttonClicked(){
        String msg = "";
       ObservableList<Integer> movies;
       movies = listView.getSelectionModel().getSelectedItems();

       for(Integer m:movies){
            //msg = String.valueOf(m);
           System.out.println(m);
       }
   }
}
