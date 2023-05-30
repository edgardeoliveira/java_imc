package edonline;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        IMC calculadora = new IMC();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = calculadora.calcular(peso, altura);
        String classificacao = calculadora.classificar(imc);

        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}