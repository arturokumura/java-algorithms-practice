//O posto de atendimento médico e hospitalar de uma pequena cidade atende em média 138 pessoas por dia e vem observando, ao longo do tempo, que os casos de pessoas com problemas de sobrepeso têm aumentado a cada ano.
//
//Sabe-se que o sobrepeso pode colaborar de maneira negativa com a saúde das pessoas. Assim, o posto de atendimento determinou que em todos os atendimentos o médico ou o enfermeiro deverá calcular o peso ideal de todos os pacientes atendidos.
//
//Para isso, deverá ser elaborado um programa que verifique se o paciente está acima de seu peso ideal de acordo com a condição abaixo:
//
//para homens: (72.7 * altura) – 58
//para mulheres: (62.1 * altura) – 44.7

package exercicios.livros;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do paciente: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Altura(m): ");
        double altura = sc.nextDouble();
        System.out.print("Sexo(F/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Peso(Kg): ");
        double peso = sc.nextDouble();
        double peso_ideal = 0;
        if (sexo == 'M'){
            peso_ideal = (72.7 * altura) - 58;
        }
        else {
            peso_ideal = (62.1 * altura) - 44.7;
        }

        if (peso > peso_ideal) {
            System.out.println("Peso ideal: " + peso_ideal);
            System.out.print("O paciente " + nome + " está acima do peso");
        }
        else {
            System.out.println("Peso ideal: " + peso_ideal);
            System.out.print("O paciente " + nome + " está dentro do peso ideal");
        }
    }
}
