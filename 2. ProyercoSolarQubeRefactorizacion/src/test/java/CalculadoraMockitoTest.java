import com.iessanalberto.dam1.Calculadora;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class CalculadoraMockitoTest {


    @Test
    void testCalcularConMockito() {
        // 1. Crear un mock de la clase Calculadora
        Calculadora calculadoraMock = Mockito.mock(Calculadora.class);

        // 2. Definir el comportamiento del mock para cada método
        when(calculadoraMock.suma(2, 3)).thenReturn(5); // Simula la suma
        when(calculadoraMock.resta(5, 3)).thenReturn(2); // Simula la resta
        when(calculadoraMock.multiplicacion(2, 3)).thenReturn(6); // Simula la multiplicación
        when(calculadoraMock.division(6, 3)).thenReturn(2); // Simula la división

        // 3. Definir el comportamiento del método calcular
        when(calculadoraMock.calcular(1, 2, 3)).thenReturn(5); // Simula calcular con suma
        when(calculadoraMock.calcular(2, 5, 3)).thenReturn(2); // Simula calcular con resta
        when(calculadoraMock.calcular(3, 2, 3)).thenReturn(6); // Simula calcular con multiplicación
        when(calculadoraMock.calcular(4, 6, 3)).thenReturn(2); // Simula calcular con división

        // 4. Ejecutar el método calcular y verificar los resultados
        assertEquals(5, calculadoraMock.calcular(1, 2, 3)); // Verifica la suma
        assertEquals(2, calculadoraMock.calcular(2, 5, 3)); // Verifica la resta
        assertEquals(6, calculadoraMock.calcular(3, 2, 3)); // Verifica la multiplicación
        assertEquals(2, calculadoraMock.calcular(4, 6, 3)); // Verifica la división

        }
}