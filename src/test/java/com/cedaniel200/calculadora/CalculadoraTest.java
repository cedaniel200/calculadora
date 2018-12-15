package com.cedaniel200.calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setup(){
        calculadora = new CalculadoraPorDefecto();
    }

    @Test
    public void testExitosoSilaSumaEsCero(){
        int resultado = calculadora.sumar();

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void testExitosoSilaSumaEsSiete(){
        int resultado = calculadora.sumar(7);

        Assert.assertEquals(7, resultado);
    }

    @Test
    public void testExitosoSilaSumaEs8(){
        int resultado = calculadora.sumar(1, 2, 5);

        Assert.assertEquals(8, resultado);
    }

    @Test
    public void testExitosoSilaSumaEsMenosNueve(){
        int resultado = calculadora.sumar(10, -2, -9, -8);

        Assert.assertEquals(-9, resultado);
    }

}
