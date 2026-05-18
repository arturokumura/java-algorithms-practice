package exercicios.livros;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho do vetor: ");
        int n = sc.nextInt();
        int [] num = new int[n];
        for (int p = 0; p < num.length; p++){
            System.out.println("Digite o " + (p +1) + "° número");
            num[p] = sc.nextInt();
        }
        System.out.println("[1]-Ordenação (Selection sort)");
        System.out.println("[2]-Ordenação (Bubble sort)");
        System.out.println("[3]-Busca binára");
        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                selection_sort(num);
                break;

            case 2:
                bubble_sort(num);
                break;

            case 3:
                busca_binaria(sc,num);
                break;

            default:
                System.out.println("Digite uma opção válida!");
        }
    }
    static void selection_sort(int [] num){
        int menor,x;
        for (int i = 0; i < num.length-1; i++){
            menor = i;
            x = num[i];
            for (int j = i+1; j < num.length ; j++) {
                if (num[j] < x) {
                    menor = j;
                    x = num[j];
                }
            }
            num[menor] = num[i];
            num[i] = x;
        }
        for (int elemento: num) {
            System.out.println(elemento);
        }
    }

    static void bubble_sort(int [] num){
        int x;
        for (int i = 0; i < num.length -1; i++){
            for (int j = num.length-1; j > i; j--) {
                if (num[j -1] > num[j]) {
                    x = num[j-1];
                    num[j-1] = num[j];
                    num[j] = x;
                }
            }
        }
        for (int elemento: num) {
            System.out.println(elemento);
        }
    }

    static boolean busca_binaria(Scanner sc, int [] num) {
        System.out.print("Qual número deseja buscar: ");
        int x = sc.nextInt();
        int inicio = 0;
        int meio;
        int fim = num.length-1;
        while (inicio <= fim) {
            meio = (inicio + fim) /2;
            if (x == num[meio])
                return true;
            if (x < num[meio])
                fim = meio -1;
            else
                inicio = meio + 1;
        }
        return false;
    }
}
