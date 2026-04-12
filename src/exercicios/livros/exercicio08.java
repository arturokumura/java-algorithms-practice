//1. Pedro tem 1,50 metro e cresce 2 centímetros por ano, e Lucas tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que:
//
//a) Lucas e Pedro tenham o mesmo tamanho;
//b) Lucas seja maior que Pedro.
package exercicios.livros;

public class exercicio08 {
    public static void main(String[] args) {
        double alt_pedro = 150;
        double alt_lucas = 110;
        int cont = 0;

        while (alt_lucas <= alt_pedro) {
            alt_pedro += 2;
            alt_lucas += 3;
            cont++;
        }
        System.out.println("Anos: " + cont);
    }
}