# FizzBuzz (ESP(～￣▽￣)～)

Este proyecto implementa el clásico problema de **FizzBuzz** en Java. La aplicación imprime "Fizz" para números múltiplos de 3, "Buzz" para números múltiplos de 5 y "FizzBuzz" para números múltiplos de ambos, 3 y 5. El proyecto incluye la lógica principal y pruebas unitarias para verificar su correcto funcionamiento.

## Estructura del proyecto

- **Fizzbuzz.java**: Clase principal que contiene los métodos `checkNumber` y `evaluate` para verificar el número y determinar el resultado de FizzBuzz.
- **FizzBuzzTest.java**: Clase de prueba que utiliza JUnit para verificar el funcionamiento de la clase `Fizzbuzz`.

## Requisitos

- **Java 8** o una versión más reciente
- **JUnit 5** para realizar las pruebas

## Instrucciones de instalación

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/YuliiaBi1a/FizzBuzz.git

2. **Ve a la carpeta del proyecto:**:
   ```bash
    cd fizzbuzz

3. **Abre el proyecto en un IDE o compílalo desde la línea de comandos.**   
   
## Instrucciones de uso

### Clase principal Fizzbuzz

La clase Fizzbuzz contiene dos métodos principales:
 - checkNumber(int number): Devuelve "Fizz", "Buzz" o "FizzBuzz" dependiendo del número.
 - evaluate(int number): Llama a checkNumber y devuelve el resultado.

    ```bash
    public String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public String evaluate(int i) {
        return checkNumber(i);
    }
### Pruebas con JUnit
El archivo FizzBuzzTest.java contiene pruebas unitarias para verificar el funcionamiento del método evalúate.
1. Ejecuta las pruebas desde tu IDE o desde la línea de comandos si estás usando JUnit:
    ```bash
   javac -cp .:junit-platform-console-standalone-1.8.1.jar fizzbuzz/*.java
   java -jar junit-platform-console-standalone-1.8.1.jar -cp . --select-package fizzbuzz
2. Las pruebas verifican varios casos:
   - Números que no son múltiplos de 3 ni de 5
   - Números múltiplos de 3
   - Números múltiplos de 5
   - Números múltiplos de 3 y 5

## Autor 
- Yulia Bila
- https://github.com/YuliiaBi1a