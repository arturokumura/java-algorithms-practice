package exercicios.livros;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data1 = new ArrayList<>();
        ArrayList<Integer> data2 = new ArrayList<>();
        System.out.println("--------------------Primeira data---------------");
        System.out.println("Dia: ");
        int dia1 = sc.nextInt();
        data1.add(dia1);
        System.out.println("Mês: ");
        int mes1 = sc.nextInt();
        data1.add(mes1);
        System.out.println("Ano: ");
        int ano1 = sc.nextInt();
        data1.add(ano1);
        System.out.println("--------------------Segunda data---------------");
        System.out.println("Dia: ");
        int dia2 = sc.nextInt();
        data2.add(dia2);
        System.out.println("Mês: ");
        int mes2 = sc.nextInt();
        data2.add(mes2);
        System.out.println("Ano: ");
        int ano2 = sc.nextInt();
        data2.add(ano2);
        System.out.println(data1);
        System.out.println(data2);

        calcular(data1,data2);
    }
   static void calcular(ArrayList<Integer> data1, ArrayList<Integer> data2) {
        int dia_dif = data1.get(0) - data2.get(0);
        int mes_dif = data1.get(1) - data2.get(1);
        int ano_dif = data1.get(2) - data2.get(2);
        int horas_dias = dia_dif * 24;
        int horas_mes = mes_dif * 720;
        int horas_anos = (int) (ano_dif * 262.800);

        int soma = horas_dias + horas_mes + horas_anos;
        System.out.println("A diferença de horas entre as datas são: " + soma);
   }
}
