//. Dados os vetores A = [15, 44, 23, 1, 0, 18, 17, 37, 35, 54] e B = [32, 115, 48, 55, 51, 0, 48, 85, 15, 99],
// crie algoritmos para gerar uma matriz de multiplicação dos elementos de A pelos elementos de B.
// Observe que C[1, 1] = A[1] * B[1], C[1, 2] = A[1] * B[2], C[1, 3] = A[1] * B[3], C[2, 1] = A[2] * B[1], etc.
package exercicios.livros;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = {15, 44, 23, 1, 0, 18, 17, 37, 35, 54};
        int [] B = {32, 115, 48, 55, 51, 0, 48, 85, 15, 99};
        int [][] c = new int[10][10];

        // Preenchendo a matriz
        for (int i = 0; i < 10; i++) {       // linhas (A)
            for (int j = 0; j < 10; j++) {   // colunas (B)
                c[i][j] = A[i] * B[j];
            }
        }

        // Mostrando a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();}}
}
