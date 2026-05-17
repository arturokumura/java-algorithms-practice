package exercicios.livros;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio32 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Vetor 1-------");
        System.out.println("Tamanho: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("-------Vetor 2------");
        System.out.println("Tamanho: ");
        int m = sc.nextInt();
        int [] b = new int[m];
        System.out.println("Preencher vetor 1: ");
        for (int p = 0; p < a.length; p++){
            a[p] = sc.nextInt();
        }
        System.out.println("Preencher vetor 2: ");
        for (int y = 0; y < b.length; y++) {
            b[y] = sc.nextInt();
        }
        ord(a,b);
    }
    static void ord(int []a, int[]b) {
        int [] c = new int[a.length + b.length];
        for (int l = 0; l < a.length; l++) {
            c[l] = a[l];
        }
        for (int t = 0; t < b.length; t++) {
            c[a.length + t] = b[t];
        }
        int menor,x;
        //selection sort
        for (int i = 0; i < c.length-1; i++) {
            menor = i;
            x = c[i];
            for (int j= i + 1; j < c.length; j++){
                if (c[j] < x) {
                    menor = j;
                    x = c[j];
                }
            }
            c[menor] = c[i];
            c[i] = x;
        }
        for (int z : c) {
            System.out.println(z);
        }
    }
}
