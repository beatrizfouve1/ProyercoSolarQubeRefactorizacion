package com.iessanalberto.dam1.proyectojenkinscalcularfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CalculadoraController {
    @FXML
    public TextField txtNumero1;
    @FXML
    public TextField txtNumero2;
    @FXML
    public TextField txtResultado;

    public Operaciones operaciones = new Operaciones();

    @FXML
    private void initialize() {
        // Inicialización si es necesaria
    }

    @FXML
    public void handleSumar() {
        realizarOperacion(Operaciones.SUMA);
    }

    @FXML
    public void handleRestar() {
        realizarOperacion(Operaciones.RESTA);
    }

    @FXML
    private void handleMultiplicar() {
        realizarOperacion(Operaciones.MULTIPLICACION);
    }

    @FXML
    private void handleDividir() {
        realizarOperacion(Operaciones.DIVISION);
    }

    private void realizarOperacion(int operacion) {
        try {
            int num1 = Integer.parseInt(txtNumero1.getText());
            int num2 = Integer.parseInt(txtNumero2.getText());

            int resultado = operaciones.calcular(operacion, num1, num2);
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            mostrarError("Por favor, introduce números válidos.");
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }

    private void mostrarError(String mensaje) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}