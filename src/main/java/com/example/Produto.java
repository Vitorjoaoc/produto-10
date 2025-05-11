package com.example;

public class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public boolean precoValido() {
        return preco > 0;
    }

    public double calcularPrecoComAcrecimo() {
        return preco * 1.10;
    }
}
