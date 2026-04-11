//A empresa XSoftware Ltda. concederá o aumento salarial anual aos seus funcionários.
//Esse aumento é variável de acordo com o cargo e o tempo de serviço na empresa, conforme a tabela a seguir.
//
//Faça um algoritmo que leia o salário, o cargo e a data de admissão de um funcionário e calcule o novo salário.
// Calcule o tempo de serviço a partir da data atual.
//Se o cargo do funcionário não estiver na tabela, ele deverá receber 7% de aumento.
// Mostre o salário antigo, o novo salário e a diferença.
//
package exercicios.livros;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        System.out.println("Cargo(Gerente/Engenheiro/Técnico): ");
        String cargo = sc.next();

        // Data de admissão
        System.out.print("Ano de admissão: ");
        int ano = sc.nextInt();
        System.out.print("Mês de admissão: ");
        int mes = sc.nextInt();
        System.out.print("Dia de admissão: ");
        int dia = sc.nextInt();
        LocalDate admissao = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(admissao, hoje);
        int anos = periodo.getYears();

        double novo_salario = 0;
        if (cargo.equalsIgnoreCase("Gerente")) {
            if (anos >= 5) {
                novo_salario = salario * 1.10;
            } else if (anos >= 3) {
                novo_salario = salario * 1.09;
            } else {
                novo_salario = salario * 1.08;
            }

        } else if (cargo.equalsIgnoreCase("Engenheiro")) {
            if (anos >= 5) {
                novo_salario = salario * 1.11;
            } else if (anos >= 3) {
                novo_salario = salario * 1.10;
            } else {
                novo_salario = salario * 1.09;
            }

        } else if (cargo.equalsIgnoreCase("Técnico")) {
            if (anos >= 5) {
                novo_salario = salario * 1.12;
            } else if (anos >= 3) {
                novo_salario = salario * 1.10;
            } else {
                novo_salario = salario * 1.10;
            }

        } else {
            novo_salario = salario * 1.07;
        }

        System.out.println("Salário antigo: " + salario);
        System.out.println("Novo salário " + novo_salario);
        System.out.print("Diferença: " + (novo_salario - salario));
    }
}
