package com.cedaniel200.calculadora;

import java.util.Arrays;

public class CalculadoraPorDefecto implements Calculadora {
    @Override
    public int sumar(int... numeros) {
        return Arrays.stream(numeros).reduce((left, right) -> left += right).orElse(0);
    }

    @Override
    public int restar(int... numeros) {
        return Arrays.stream(numeros).reduce((left, right) -> left -= right).orElse(0);
    }

    @Override
    public int multiplicar(int... numeros) {
        return Arrays.stream(numeros).reduce((left, right) -> left *= right).orElse(0);
    }

    @Override
    public int dividir(int dividendo, int divisor) {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
