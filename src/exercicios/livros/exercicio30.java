package exercicios.livros;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números para ordenar?");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        System.out.println("[1]-Ordem crescente");
        System.out.println("[2]-Ordem decrescente");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                cresc(sc,numeros,n);
                break;

            case 2:
                decres(sc,numeros);
                break;
            default:
                System.out.print("Digite uma opção válida!");
        }
    }
    static void cresc(Scanner sc,int[] numeros, int n){
        int menor,x;
        System.out.print("Digite os numeros: ");
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i< numeros.length -1; i++) {
            menor = i;
            x = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < x) {
                    menor = j;
                    x = numeros[j];
                }
            }
            numeros[menor] = numeros[i];
            numeros[i] = x;

        }
        for (int c : numeros) {
            System.out.println(c);
        }
    }
    static void decres(Scanner sc, int[] numeros){
        int menor,x;
        System.out.print("Digite os numeros: ");
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i< numeros.length -1; i++) {
            menor = i;
            x = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < x) {
                    menor = j;
                    x = numeros[j];
                }
            }
            numeros[menor] = numeros[i];
            numeros[i] = x;
        }
        for (int m =numeros.length-1; m >= 0; m--) {
            System.out.println(numeros[m]);
        }
    }
}
