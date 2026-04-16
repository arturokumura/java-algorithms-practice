package exercicios.livros;

import java.util.Scanner;

public class exercicio13 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i<= x ; i++) {
           fatorial = fatorial * i;
        }
        System.out.print("O fatorial de " + x + " é: " + fatorial);
    }
}
