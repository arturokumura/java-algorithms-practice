package exercicios.livros;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite os valores de A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        int[] C = new int[20];

        // 🔗 Copiar A para C
        for (int i = 0; i < 10; i++) {
            C[i] = A[i];
        }

        // 🔗 Copiar B para C
        for (int i = 0; i < 10; i++) {
            C[i + 10] = B[i];
        }

        // 🔁 Ordenar C (Bubble Sort)
        for (int i = 0; i < C.length - 1; i++) {
            for (int j = 0; j < C.length - 1; j++) {
                if (C[j] > C[j + 1]) {
                    int temp = C[j];
                    C[j] = C[j + 1];
                    C[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor C (união ordenada):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

    }
}
