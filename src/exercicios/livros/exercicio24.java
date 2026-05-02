package exercicios.livros;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos animais serão cadastrados? ");
        int n = sc.nextInt();

        // Contadores
        int qtdBovinoM = 0, qtdBovinoF = 0;
        int qtdOvinoM = 0, qtdOvinoF = 0;
        int qtdCaprinoM = 0, qtdCaprinoF = 0;

        // Somas dos pesos
        double somaBovinoM = 0, somaBovinoF = 0;
        double somaOvinoM = 0, somaOvinoF = 0;
        double somaCaprinoM = 0, somaCaprinoF = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nAnimal " + (i + 1));

            System.out.println("Qual espécie?");
            System.out.println("[1] Bovino");
            System.out.println("[2] Ovino");
            System.out.println("[3] Caprino");
            int animal = sc.nextInt();

            System.out.println("Qual o sexo? (m/f)");
            char sexo = sc.next().toLowerCase().charAt(0);

            System.out.println("Qual o peso (kg)?");
            double peso = sc.nextDouble();

            if (animal == 1 && sexo == 'm') {
                qtdBovinoM++;
                somaBovinoM += peso;
            } else if (animal == 1 && sexo == 'f') {
                qtdBovinoF++;
                somaBovinoF += peso;
            } else if (animal == 2 && sexo == 'm') {
                qtdOvinoM++;
                somaOvinoM += peso;
            } else if (animal == 2 && sexo == 'f') {
                qtdOvinoF++;
                somaOvinoF += peso;
            } else if (animal == 3 && sexo == 'm') {
                qtdCaprinoM++;
                somaCaprinoM += peso;
            } else if (animal == 3 && sexo == 'f') {
                qtdCaprinoF++;
                somaCaprinoF += peso;
            } else {
                System.out.println("Entrada inválida!");
                i--; // refaz essa iteração
            }
        }

        medias(
                somaBovinoM, qtdBovinoM,
                somaBovinoF, qtdBovinoF,
                somaOvinoM, qtdOvinoM,
                somaOvinoF, qtdOvinoF,
                somaCaprinoM, qtdCaprinoM,
                somaCaprinoF, qtdCaprinoF
        );

        sc.close();
    }

    static void medias(
            double somaBovinoM, int qtdBovinoM,
            double somaBovinoF, int qtdBovinoF,
            double somaOvinoM, int qtdOvinoM,
            double somaOvinoF, int qtdOvinoF,
            double somaCaprinoM, int qtdCaprinoM,
            double somaCaprinoF, int qtdCaprinoF
    ) {
        System.out.println("\n=== MÉDIAS DE PESO ===");

        if (qtdBovinoM > 0)
            System.out.println("Bovino Macho: " + (somaBovinoM / qtdBovinoM));
        else
            System.out.println("Bovino Macho: sem dados");

        if (qtdBovinoF > 0)
            System.out.println("Bovino Fêmea: " + (somaBovinoF / qtdBovinoF));
        else
            System.out.println("Bovino Fêmea: sem dados");

        if (qtdOvinoM > 0)
            System.out.println("Ovino Macho: " + (somaOvinoM / qtdOvinoM));
        else
            System.out.println("Ovino Macho: sem dados");

        if (qtdOvinoF > 0)
            System.out.println("Ovino Fêmea: " + (somaOvinoF / qtdOvinoF));
        else
            System.out.println("Ovino Fêmea: sem dados");

        if (qtdCaprinoM > 0)
            System.out.println("Caprino Macho: " + (somaCaprinoM / qtdCaprinoM));
        else
            System.out.println("Caprino Macho: sem dados");

        if (qtdCaprinoF > 0)
            System.out.println("Caprino Fêmea: " + (somaCaprinoF / qtdCaprinoF));
        else
            System.out.println("Caprino Fêmea: sem dados");
    }
}
