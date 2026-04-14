package exercicios.livros;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de termos: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int proximo = 0;
        for (int i = 0; i< n; i++) {
            System.out.println(a);
            proximo = b + a;
            a = b;
            b = proximo;
        }
    }
}
