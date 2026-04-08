//Verificar triangulos
package exercicios.livros;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor lado 1: ");
        int A = sc.nextInt();
        System.out.println("Valor lado 2: ");
        int B = sc.nextInt();
        System.out.println("Valor lado 3: ");
        int C = sc.nextInt();

        while (A != 0|| B != 0 || C != 0) {
            if (A == B && B == C) {
                System.out.print("Triângulo equilátero");
                break;
            } else if (A == B || B == C) {
                System.out.print("Triângulo isóceles");
                break;
            } else {
                System.out.print("Triângulo escaleno");
                break;
            }
        }
    }
}