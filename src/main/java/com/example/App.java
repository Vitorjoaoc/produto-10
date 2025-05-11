package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");

        try {
            double valor = Double.parseDouble(scanner.nextLine());
            Produto produto = new Produto(valor);

            if (!produto.precoValido()) {
                System.out.println("Número inválido, tente novamente.");
            } else {
                double novoValor = produto.calcularPrecoComAcrecimo();
                System.out.printf("Novo valor do produto: %.2f\n", novoValor);
            }

        } catch (NumberFormatException e) {
            System.out.println("Número inválido, tente novamente.");
        }

        scanner.close();
    }
}
