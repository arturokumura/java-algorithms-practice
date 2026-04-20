//2. Dadas as temperaturas que foram registradas diariamente durante uma semana, deseja-se determinar em quantos dias dessa semana a temperatura esteve acima da média. A solução para esse problema envolve os seguintes passos:
//a) obter os valores das temperaturas;
//b) calcular a média desses valores;
//c) verificar quantos deles são maiores que a média.//
package exercicios.livros;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int cont = 0;

        int[] temp = new int[7];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Temperatura: "+ (i +1) + '°');
            temp[i] = sc.nextInt();
            total += temp[i];
        }
        double media = total / 7;

        for (int t : temp) {
            if (t > media) {
                cont += 1;
            }
        }
        System.out.println("Média da temperatura semanal: " + media);
        System.out.println("Maiores que a média: " + cont);
    }
}
