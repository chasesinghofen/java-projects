package com.paycheck;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml")); 
        primaryStage.setTitle("Paycheck");
        primaryStage.setScene(new Scene(root, 300, 300));
        //primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
