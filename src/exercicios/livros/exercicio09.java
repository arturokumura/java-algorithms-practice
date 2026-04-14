//2. A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de funcionários para várias empresas em diversos ramos de atuação. Atende em média 30 candidatos por dia, mas esse valor aumenta quando faz divulgação de vagas. Para facilitar o trabalho de identificação do perfil dos candidatos que se inscrevem para as vagas, resolveu fazer um programa para registrar alguns dados para obter as informações a seguir:
//
//» número de candidatos do sexo feminino;
//» número de candidatos do sexo masculino;
//» idade média dos homens;
//» idade média das mulheres com experiência;
//» porcentagem dos homens entre 35 e 45 anos entre o total dos homens;
//» menor idade entre as mulheres que já têm experiência no serviço;
package exercicios.livros;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int candidatos_fem = 0;
        int candidatos_masc = 0;
        int idade_masc = 0;
        int idade_fem = 0;
        int idade_intervalo = 0;
        int ensino_fundamental =0;
        int ensino_medio = 0;
        int graduacao = 0;
        int pos = 0;

        System.out.print("Cadastrar candidato?(s/n): ");
        char resp = sc.next().charAt(0);

        while (resp == 's') {
            System.out.println("Qual seu sexo?(m/f): ");
            String sexo = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Têm experiência no serviço?(s/n): ");
            String experiencia = sc.next();
            System.out.println("Nível de escolaridade: ");
            System.out.println("[1] - Ensino Fundamental");
            System.out.println("[2] - Ensino Médio");
            System.out.println("[3] - Graduação");
            System.out.println("[4] - Pós-graduação");
            String escolaridade = sc.next();
            System.out.print("-----------------------------");
            System.out.print("Cadastrar candidato?(s/n): ");
            resp = sc.next().charAt(0);

            //Numero de candidatos por sexo
            if (sexo.equals( "m")) {
                candidatos_masc += 1;
                idade_masc += idade;
                if (idade >= 35 && idade <= 45) {
                    idade_intervalo += 1;
                }
            }
            else {
                candidatos_fem += 1;
                idade_fem += idade;
            }
            int total = candidatos_masc + candidatos_fem;

            if (escolaridade.equals("1")) {
                ensino_fundamental += 1;
            } else if (escolaridade.equals("2")) {
                ensino_medio += 1;
            } else if (escolaridade.equals("3")) {
                graduacao += 1;
            }
            else {
                pos += 1;
            }
        }
        int total = candidatos_masc + candidatos_fem;
        double idade_media_masc = (double) idade_masc / candidatos_masc;
        double idade_media_fem = candidatos_fem / total;
        double porcentagem_idade_masc = (double) idade_intervalo * 100 / candidatos_masc;
        System.out.println("Número de candidatos do sexo feminino: " + candidatos_fem);
        System.out.println("Número de candidatos do sexo masculino: " + candidatos_masc);
        System.out.println("Idade média dos homens: " + idade_media_masc);
        System.out.println("Idade média das mulheres: " + idade_media_fem);
        System.out.println("Homens com idade entre 35 e 45 anos: " + porcentagem_idade_masc);
        System.out.println("Nivel de escolaridade dos candidatos: ");
        System.out.println("Ensino Fundamental: " + ensino_fundamental);
        System.out.println("Ensino medio: " + ensino_medio);
        System.out.println("Graduação: " + graduacao);
        System.out.println("Pos-graduação: " + pos);
    }
}
