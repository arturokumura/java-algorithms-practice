package exercicios.livros;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int max = 1;
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        max_divisores(n1,n2,cont,max);
    }

    static void max_divisores(int n1, int n2, int cont,int max) {
        int limite = 0;
        if (n1 > n2 ) {
            limite = n1;
        }
        else limite = n2;

        for (int i= 1; i <= limite; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                max = i;
            }
        }
        System.out.println("O maximo divisor comume entre " + n1 + " e " + n2 +" é " + max);
    }
}
