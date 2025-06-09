package com.iessanalberto.dam1.proyectojenkinscalcularfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/iessanalberto/dam1/proyectojenkinscalcularfx/hello-view.fxml"

        ));
        Parent root = loader.load();

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Calculadora JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}