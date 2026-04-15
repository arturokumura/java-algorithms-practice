//Foi realizada uma pesquisa de algumas características físicas da população de certa região, a qual coletou os seguintes dados referentes a cada habitante para serem analisados:
//
//sexo (masculino e feminino);
//cor dos olhos (azuis, verdes ou castanhos);
//cor dos cabelos (louros, castanhos, pretos);
//idade;
//altura;
//peso.
//
//Apresente a média da idade dos participantes,
// a média do peso e da altura de seus habitantes,
// a porcentagem de pessoas do sexo feminino e
// a porcentagem de pessoas do masculino.
// Quantas pessoas possuem olhos verdes e cabelos louros?
// A cada iteração deverá ser perguntado ao usuário se deseja continuar ou não.
// Os resultados deverão ser apresentados apenas quando o usuário não desejar mais inserir dados.
package exercicios.livros;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade_total = 0;
        double peso_total = 0;
        double altura_total = 0;
        int mulheres_total = 0;
        int homens_total = 0;
        int olho_cabelo = 0;

        System.out.print("Cadastrar habitante(s/n): ");
        String resp = sc.next();
        while (resp.equals("s")) {
            System.out.print("Sexo(f/m): ");
            char sexo = sc.next().charAt(0);
            System.out.println("Cor dos olhos(azuis/verdes ou castanhos/pretos): ");
            String cor_olhos = sc.next();
            System.out.println("Cor dos cabelos(louros/castanhos/pretos): ");
            String cor_cabelo = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            System.out.println("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Cadastrar habitante(s/n): ");
            resp = sc.next();
            idade_total += idade;
            peso_total += peso;
            altura_total += altura;

            if (sexo == 'f') {
                mulheres_total += 1;
            }
            else {
                homens_total += 1;
            }

            if (cor_olhos.equals("verde") && cor_cabelo.equals("louros")) {
                olho_cabelo += 1;
            }
        }
        int total = mulheres_total + homens_total;
        double media_idade = idade_total / (double)total;
        double media_peso = peso_total / (double)total;
        double media_altura = altura_total / (double)total;
        int porcentagem_mulher = mulheres_total * 100 / total;
        int porcentagem_homem = homens_total * 100 / total;

        System.out.println("--------------------------");
        System.out.println("Média de idade: " + media_idade);
        System.out.println("Média do peso: " + media_peso);
        System.out.println("Média da altura: " + media_altura);
        System.out.println("Pessoas do sexo feminino: " + porcentagem_mulher + "%");
        System.out.println("Pessoas do sexo masculino: " + porcentagem_homem + "%");
        System.out.println("Pessoas que possuem olhos verdes e cabelos louros: " + olho_cabelo);
        System.out.println("---------------------------");
    }
}
