package exercicios.livros;

import java.util.Scanner;

public class exercicio17 {
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
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Mostrar resultado
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}


