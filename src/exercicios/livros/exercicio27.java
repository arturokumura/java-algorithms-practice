package exercicios.livros;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        funcao(sc, salario);
    }
    static void funcao(Scanner sc, double salario) {
        double novo_salario = salario * 1.15;
        System.out.print("Salario reajustado: " + novo_salario);
    }
}
