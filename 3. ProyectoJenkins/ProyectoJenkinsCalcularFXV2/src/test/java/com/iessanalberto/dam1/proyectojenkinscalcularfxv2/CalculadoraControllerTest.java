package com.iessanalberto.dam1.proyectojenkinscalcularfxv2;

import com.iessanalberto.dam1.proyectojenkinscalcularfx.CalculadoraController;
import com.iessanalberto.dam1.proyectojenkinscalcularfx.Operaciones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculadoraControllerTest {

    private CalculadoraController controller;

    @Mock
    private Operaciones mockOperaciones;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        controller = new CalculadoraController();
        controller.txtNumero1 = new javafx.scene.control.TextField();
        controller.txtNumero2 = new javafx.scene.control.TextField();
        controller.txtResultado = new javafx.scene.control.TextField();
        controller.operaciones = mockOperaciones;
    }

    @Test
    public void testHandleSumar() {
        // Configuración
        controller.txtNumero1.setText("5");
        controller.txtNumero2.setText("3");
        when(mockOperaciones.calcular(Operaciones.SUMA, 5, 3)).thenReturn(8);

        // Ejecución
        controller.handleSumar();

        // Verificación
        assertEquals("8", controller.txtResultado.getText());
        verify(mockOperaciones).calcular(Operaciones.SUMA, 5, 3);
    }
}