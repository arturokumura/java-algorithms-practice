package exercicios.livros;

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        int[][] mat = {
                {5, 2, 8},
                {1, 9, 3},
                {7, 4, 6}
        };

        int linhas = mat.length;
        int colunas = mat[0].length;

// ==========================
// 1. Copiar matriz para vetor
// ==========================
        int[] vetor = new int[linhas * colunas];
        int k = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[k] = mat[i][j];
                k++;
            }
        }

// ==========================
// 2. Bubble Sort no vetor
// ==========================
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

// ==========================
// 3. Copiar vetor para matriz
// ==========================
        k = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mat[i][j] = vetor[k];
                k++;
            }
        }

// ==========================
// 4. Mostrar matriz ordenada
// ==========================
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }}