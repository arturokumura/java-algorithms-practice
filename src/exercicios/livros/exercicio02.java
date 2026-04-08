//Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador
// pode escolher entre dois critérios de desconto:
//Critério A: R$0,25 por livro + R$7,50 fixo
//Critério B: R$0,50 por livro + R$2,50 fixo
//Faça um programa em que o usuário digite a quantidade de livros e diga qual a melhor opção de compra

package exercicios.livros;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de livros: ");
        int quantidade = sc.nextInt();

        //Critérios
        double A = 7.50 + (quantidade * 0.25);
        double B = 2.50 + (quantidade * 0.50);

        if (A > B){
            System.out.print("A melhor opção de compra é o critério B: " );
        }
        else {
            System.out.print("A melhor opção de compra é o critério A: ");
        }
    }
}
