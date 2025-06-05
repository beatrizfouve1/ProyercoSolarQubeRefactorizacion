import com.iessanalberto.dam1.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTestRojoSuma {
    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.suma(2, 3)); // 2 + 3 = 5
    }
}
