package com.cloudskol.jfxskol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        final VBox vBox = new VBox();
        vBox.getChildren().add(new Label("Hello world."));

        primaryStage.setScene(new Scene(vBox, 500, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
