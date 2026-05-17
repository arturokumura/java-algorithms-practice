package exercicios.livros;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros?");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Digite os numeros: ");
        for (int c = 0; c < n; c++) {
            num[c] = sc.nextInt();
        }
        decres(num);
    }

    static void decres(int[] num) {
        int x;
        for (int i = 1; i < num.length; i++) {
            for (int j = num.length - 1; j >= i; j--) {
                if (num[j - 1] < num[j]) {
                    x = num[j - 1];
                    num[j-1] = num[j];
                    num[j] = x;
                }
            }
        }
        for (int m : num) {
            System.out.println(m);
        }
    }
}
