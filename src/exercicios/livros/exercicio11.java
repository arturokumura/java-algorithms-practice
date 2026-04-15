//5. Dada uma faixa de valores, cujo valor inicial e o valor final deverão ser fornecidos pelo usuário, identifique:
//a) a quantidade de números inteiros e positivos;
//b) a quantidade de números pares;
//c) a quantidade de números ímpares;
//d) a quantidade de números ímpares e divisíveis por 3 e 4 ao mesmo tempo;
//e) media total
package exercicios.livros;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero de inicio: ");
        int A = sc.nextInt();
        System.out.println("Informe o numero final: ");
        int B = sc.nextInt();
        int quantidade_inteiro = 0;
        int positivos = 0;
        int pares = 0;
        int impares = 0;
        int divisores = 0;
        int total = 0;

        for (int i = A ; i < B + 1; i++ ) {
            quantidade_inteiro += 1;
            if (i >= 0) {
                positivos += 1;
            }
            //Pares e impares
            if (i % 2 == 0) {
                pares += 1;
            }
            else {
                impares += 1;
            }
            //Divisores
            if (i % 2 != 0 && i % 3 == 0 && i % 4 == 0) {
                divisores += 1;
            }
            total += i;
        }
        double media = (double) total / quantidade_inteiro;
        System.out.println("----------------------");
        System.out.println("Números inteiros: " + quantidade_inteiro);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Divisores de 3 e 4: " + divisores);
        System.out.print("Média: " + media);
    }
}
