package exercicios.livros;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = new int[5];
        int[] e = new int[5];

        System.out.println("Digite os valores de a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de b: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de c: ");
        for (int i = 0; i < b.length; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de d: ");
        for (int i = 0; i < b.length; i++) {
            d[i] = sc.nextInt();
        }
        System.out.println("Digite os valores de e: ");
        for (int i = 0; i < b.length; i++) {
            e[i] = sc.nextInt();
        }

        int [][] mat = new int[5][5];

        mat[0] = a;
        mat[1] = b;
        mat[2] = c;
        mat[3] = d;
        mat[4] = e;

        System.out.println("\nMatriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
