package com.cloudskol.jfxskol;

import com.cloudskol.jfxskol.binding.DirectionalBinding;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start: " + Thread.currentThread().getName());
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        final VBox vBox = new VBox();
//        vBox.setSpacing(10);
//        renderUi(vBox);

//        new BindingEntry().testBind();
        new DirectionalBinding().testDirectional();

        primaryStage.setScene(new Scene(vBox, 700, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("Init: " + Thread.currentThread().getName());
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop: " + Thread.currentThread().getName());
    }

    private void renderUi(VBox container) {
        final HBox emailBox = new HBox();
        emailBox.setAlignment(Pos.CENTER_LEFT);
        emailBox.getChildren().add(new Label("Email"));
        emailBox.getChildren().add(new TextField());

        final HBox passwordBox = new HBox();
        passwordBox.getChildren().add(new Label("Password"));
        passwordBox.getChildren().add(new TextField());

        final HBox buttonBox = new HBox();
        final Button loginBtn = new Button("Login");
        loginBtn.setOnAction(e -> {
            System.out.println("Clicked");
        });
        buttonBox.getChildren().add(loginBtn);

        final Button closeBtn = new Button("Close");
        closeBtn.setOnAction(e -> {
            Platform.exit();
        });
        buttonBox.getChildren().add(closeBtn);

        container.getChildren().addAll(emailBox, passwordBox, buttonBox);
    }
}
