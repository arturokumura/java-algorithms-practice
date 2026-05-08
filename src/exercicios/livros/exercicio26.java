package exercicios.livros;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int[] vect = new int[30];
        while (opcao !=0 ) {
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("[1] -Preencha um vetor de inteiros");
            System.out.println("[2] -Maior elemento do vetor");
            System.out.println("[3] -Menor elemento do vetor");
            System.out.println("[4] -Soma dos elementos do vetor");
            System.out.println("[5] -Média dos elementos do vetor");
            System.out.println("[6] -Apresentar um elemento");
            System.out.println("[7] - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    vetor(sc,vect);
                    break;
                case 2:
                    maior_elemento(vect);
                    break;
                case 3:
                    menor_elemento(vect);
                    break;
                case 4:
                    soma(vect);
                    break;
                case 5:
                    media(vect);
                    break;
                case 6:
                    apresentar(sc, vect);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }
    static void vetor(Scanner sc,int []vect) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        for (int c : vect){
            System.out.println(c);
        }
    }
    static void maior_elemento( int [] vect) {
        int maior = vect[0];
        for (int i =0; i< vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
            }
        }
        System.out.println("Maior elemento: " + maior);
    }

    static void menor_elemento(int[]vect){
        int menor = vect[0];
        for (int i= 0 ; i< vect.length; i++) {
            if (vect[i] <  menor) {
                menor = vect[i];
            }
        }
        System.out.println("Menor elemento: " + menor);
    }

    static void soma(int[]vect) {
        int soma = 0;
        for (int c : vect) {
            soma += c;
        }
        System.out.println("Soma: " + soma);
    }

    static void media(int[] vect) {
        int soma = 0;
        for (int c : vect) {
            soma += c;
        }
        int media = soma / 30;
        System.out.println("Media: " + media);
    }
    static void apresentar(Scanner sc, int[]vect) {
        System.out.print("Digite um index do número que deseja apresentar: ");
        int i = sc.nextInt();
        System.out.println("Apresentar: " + vect[i]);
    }
}
