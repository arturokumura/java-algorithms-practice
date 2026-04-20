
/*Altere o código do algoritmo do Exemplo 6.5, mantendo a mesma proposta, e exiba a menor e a maior temperatura,
porém, fazendo a ordenação dos elementos de forma decrescente, antes de apresentar o resultado.*/
package exercicios.livros;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temps = new int[7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Temperatura: " + (i + 1) + '°');
            temps[i] = sc.nextInt();
        }
        // inicializa maior e menor
        double maior = temps[0];
        double menor = temps[0];

        // percorre o vetor
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maior) {
                maior = temps[i];
            }
            if (temps[i] < menor) {
                menor = temps[i];
            }
        }

        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);

        sc.close();
    }
}
