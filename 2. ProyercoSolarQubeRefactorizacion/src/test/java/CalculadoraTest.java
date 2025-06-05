import com.iessanalberto.dam1.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {


    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.suma(2, 3)); // 2 + 3 = 5
        assertEquals(-1, calculadora.suma(-2, 1)); // -2 + 1 = -1
        assertEquals(0, calculadora.suma(0, 0)); // 0 + 0 = 0
    }

    @Test
    void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.resta(3, 2)); // 3 - 2 = 1
        assertEquals(-3, calculadora.resta(0, 3)); // 0 - 3 = -3
        assertEquals(0, calculadora.resta(5, 5)); // 5 - 5 = 0
    }

    @Test
    void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicacion(2, 3)); // 2 * 3 = 6
        assertEquals(0, calculadora.multiplicacion(0, 5)); // 0 * 5 = 0
        assertEquals(-10, calculadora.multiplicacion(2, -5)); // 2 * (-5) = -10
    }

    @Test
    void testDivision() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.division(6, 3)); // 6 / 3 = 2
        assertEquals(0, calculadora.division(0, 5)); // 0 / 5 = 0
        assertEquals(-2, calculadora.division(10, -5)); // 10 / (-5) = -2
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calculadora = new Calculadora();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.division(10, 0); // División por cero
        });
        assertEquals("/ by zero", exception.getMessage()); // Verifica el mensaje de la excepción
    }

    @Test
    void testCalcularSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.calcular(1, 2, 3)); // Suma: 2 + 3 = 5
    }

    @Test
    void testCalcularResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.calcular(2, 3, 2)); // Resta: 3 - 2 = 1
    }

    @Test
    void testCalcularMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.calcular(3, 2, 3)); // Multiplicación: 2 * 3 = 6
    }

    @Test
    void testCalcularDivision() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.calcular(4, 6, 3)); // División: 6 / 3 = 2
    }

    @Test
    void testCalcularOpcionInvalida() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0, calculadora.calcular(5, 2, 3)); // Opción no válida, resultado esperado: 0
    }
}

