package com.cedaniel200.calculadora;

public interface Calculadora {
    int sumar(int... numeros);
    int restar(int... numeros);
    int multiplicar(int... numeros);
    int dividir(int dividendo, int divisor) throws ArithmeticException;
}
