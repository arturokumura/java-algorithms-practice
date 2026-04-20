//3. Crie vetores para armazenar:
//a) as letras vogais do alfabeto;
//b) as alturas de um grupo de dez pessoas;
//c) os nomes dos meses do ano.//

package exercicios.livros;

import java.util.Scanner;

public class exercicio15 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] vogais = new String[5];
        double [] alturas = new double[10];
        String [] meses = new String[12];

        System.out.println("Informe as vogais: ");
        for (int i = 0; i < vogais.length ; i++) {
            vogais [i] = sc.nextLine();
        }

        System.out.println("Informe as alturas: ");
        for (int i = 0; i < alturas.length ; i++) {
            alturas [i] = sc.nextDouble();
        }

        System.out.println("Informe os meses: ");
        for (int i = 0; i < meses.length ; i++) {
            meses [i] = sc.nextLine();
        }

        System.out.println("Vogais: ");
        for ( String v : vogais) {
            System.out.println(v);
        }

        System.out.println("Alturas: ");
        for (double a : alturas) {
            System.out.println(a);
        }

        System.out.println("Meses: ");
        for (String m : meses) {
            System.out.println(m);
        }
    }
}
