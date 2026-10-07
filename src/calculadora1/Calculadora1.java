/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora1;

public class Calculadora1 {

    // 2 segmentos
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        } else {
            return (double) a / b;
        }
    }

    // 3 segmentos
    public int suma(int a, int b, int c) {
        return a + b + c;
    }

    public int resta(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicacion(int a, int b, int c) {
        return a * b * c;
    }

    // 4 segmentos
    public int suma(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int resta(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicacion(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora1 calc = new Calculadora1();

        // Pruebas con 2 parámetros
        System.out.println("Suma (2 params): " + calc.suma(5, 3));
        System.out.println("Resta (2 params): " + calc.resta(10, 4));
        System.out.println("Multiplicación (2 params): " + calc.multiplicacion(6, 7));
        System.out.println("División (2 params): " + calc.division(20, 4));

        // Pruebas con 3 parámetros
        System.out.println("Suma (3 params): " + calc.suma(5, 3, 2));
        System.out.println("Resta (3 params): " + calc.resta(10, 4, 2));
        System.out.println("Multiplicación (3 params): " + calc.multiplicacion(2, 3, 4));

        // Pruebas con 4 parámetros
        System.out.println("Suma (4 params): " + calc.suma(1, 2, 3, 4));
        System.out.println("Resta (4 params): " + calc.resta(20, 5, 3, 2));
        System.out.println("Multiplicación (4 params): " + calc.multiplicacion(2, 2, 2, 2));
    }
}
