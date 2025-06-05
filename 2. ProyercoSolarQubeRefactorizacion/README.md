# Calculadora en Java

Este proyecto es una implementación simple de una calculadora en Java que realiza operaciones básicas como suma, resta, multiplicación y división. Además, incluye pruebas unitarias utilizando **JUnit 5**, pruebas con **Mockito** y sigue la metodología de **Desarrollo Guiado por Pruebas (TDD)**.

## Requisitos

- **Java JDK 17 o superior**.
- **Maven** (para gestionar dependencias y ejecutar pruebas).
- **JUnit 5** (para pruebas unitarias).
- **Mockito** (para pruebas de simulación).


## Instalación y Compilación
1. Clona el repositorio.
2. Navega a la carpeta del proyecto.
3. Ejecuta `mvn clean install` para compilar el proyecto.

## Ejecución de Pruebas
Ejecuta `mvn test` para ejecutar las pruebas unitarias.

## Funcionalidades Implementadas
- Pruebas unitarias con JUnit 5.
- Mocking con Mockito.


# Calculadora en Java con TDD

## ¿Qué es TDD?

**TDD (Test-Driven Development)** es una metodología de desarrollo de software que sigue un ciclo repetitivo de tres pasos:

1. **Red**: Escribir una prueba que falle.
2. **Green**: Implementar el código mínimo para que la prueba pase.
3. **Refactor**: Mejorar el código sin cambiar su comportamiento.

Este enfoque asegura que el código esté bien probado, sea mantenible y cumpla con los requisitos desde el principio.

---
## Experiencia con TDD en la Calculadora

### 1. **Comenzando con la suma**

#### Paso 1: Escribir la prueba (Red)
Comenzamos escribiendo una prueba para la operación de suma:
```java
@Test
void testSuma() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.suma(2, 3)); // 2 + 3 = 5
}

### La prueba falla porque el método suma no existe.

#### Paso 2: Implementar el código mínimo (Green)
Implementamos el método suma con el código mínimo para que la prueba pase:

public int suma(int a, int b) {
    return 5; // Implementación mínima
}

### La prueba ahora pasa, pero el código no es correcto para todos los casos.

#### Paso 3: Refactorizar
Refactorizamos el método para que funcione correctamente:

public int suma(int a, int b) {
    return a + b;
}
### Ahora el método es genérico y funciona para cualquier caso.
