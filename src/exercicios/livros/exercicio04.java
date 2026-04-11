package exercicios.livros;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas do intervalo 1(h): ");
        int horas1 = sc.nextInt();
        System.out.print("Minutos do intervalo 1(min): ");
        int min1 = sc.nextInt();
        System.out.print("Segundos do intervalo 1(s): ");
        int sec1 = sc.nextInt();
        System.out.print("Horas do intervalo 2(h): ");
        int horas2 = sc.nextInt();
        System.out.print("Minutos do intervalo 2(min): ");
        int min2 = sc.nextInt();
        System.out.print("Segundos do intervalo 2(s): ");
        int sec2 = sc.nextInt();

        //Soma
        int soma_hora = horas1 + horas2;
        int soma_minutos = min1 + min2;
        int soma_secundos = sec1 + sec2;
        if (soma_secundos >= 60) {
            soma_minutos += soma_secundos / 60;
            soma_secundos = soma_secundos % 60;
        }
        if (soma_minutos >= 60){
            soma_hora += soma_minutos / 60;
            soma_minutos = soma_minutos % 60;
        }
        System.out.print("Soma dos intervalos: "+ soma_hora +"h " + soma_minutos +"min "+ soma_secundos + "s ");
    }
}
