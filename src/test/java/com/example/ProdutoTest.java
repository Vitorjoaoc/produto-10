package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testPrecoValidoComValorPositivo() {
        Produto produto = new Produto(100.00);
        assertTrue(produto.precoValido());
    }

    @Test
    public void testPrecoInvalidoComZero() {
        Produto produto = new Produto(0.0);
        assertFalse(produto.precoValido());
    }

    @Test
    public void testPrecoInvalidoComValorNegativo() {
        Produto produto = new Produto(-50.0);
        assertFalse(produto.precoValido());
    }

    @Test
    public void testCalculoComAcrecimoDezPorcento() {
        Produto produto = new Produto(50.0);
        double resultado = produto.calcularPrecoComAcrecimo();
        assertEquals(55.0, resultado, 0.001);
    }

    @Test
    public void testCalculoComValorDecimal() {
        Produto produto = new Produto(123.45);
        double resultado = produto.calcularPrecoComAcrecimo();
        assertEquals(135.795, resultado, 0.001);
    }
}
