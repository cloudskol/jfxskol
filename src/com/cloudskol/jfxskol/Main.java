package com.cloudskol.jfxskol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        final VBox vBox = new VBox();
        renderUi(vBox);

        primaryStage.setScene(new Scene(vBox, 500, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private void renderUi(VBox container) {
        container.getChildren().add(new Label("Email"));
        container.getChildren().add(new Label("Password"));

        container.getChildren().add(new Button("Login"));
    }
}
