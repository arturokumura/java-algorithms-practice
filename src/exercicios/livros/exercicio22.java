package exercicios.livros;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Qual tipo de média deseja calcular? ");
        System.out.println("[1] - Média aritmética");
        System.out.println("[2] - Média ponderada");
        System.out.println("[3] - Média harmônica");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                m_aritmetica(numeros);
                break;
            case 2:
                m_ponderada(numeros, sc);
                break;
            case 3:
                m_harmonica(numeros);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

    // Média aritmética
    static void m_aritmetica(int[] numeros) {
        double soma = 0;

        for (int num : numeros){
            soma += num;
        }

        double media = soma / numeros.length;
        System.out.println("Média aritmética: " + media);
    }

    // Média ponderada
    static void m_ponderada(int[] numeros, Scanner sc) {
        double soma = 0;
        double somaPesos = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Peso do número " + numeros[i] + ": ");
            double peso = sc.nextDouble();

            soma += numeros[i] * peso;
            somaPesos += peso;
        }

        double media = soma / somaPesos;
        System.out.println("Média ponderada: " + media);
    }

    // Média harmônica
    static void m_harmonica(int[] numeros) {
        double soma = 0;

        for (int num : numeros){
            soma += 1.0 / num;
        }

        double media = numeros.length / soma;
        System.out.println("Média harmônica: " + media);
    }
}