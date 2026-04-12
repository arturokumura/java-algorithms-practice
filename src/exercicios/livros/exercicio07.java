//Muitas empresas utilizam algoritmos para validação do CPF (cadastro de pessoa física).
//O algoritmo que deverá ser elaborado deve ser capaz de receber um CPF completo e verificar se está correto.
// Para isso deverá checar os dígitos verificadores. O número do CPF é composto de 11 dígitos, sendo que os dois últimos são os dígitos verificadores.
//A validação do CPF é feita por meio de cálculos com base nos 9 primeiros dígitos. As etapas desse cálculo são descritas a seguir.
//Para isso, vamos utilizar o CPF exemplo ABC.DEF.GHI-XX. Após a elaboração do algoritmo, faça o teste de mesa com os seguintes valores de CPF e verifique se são válidos:
//123.456.789-09 e 456.321.556-98
//
//Cálculo do X
//
//Passo 1 – Multiplicar o dígito A por 10, o dígito B por 9, o dígito C por 8 e assim sucessivamente até o dígito I, que deverá ser multiplicado por 2.
//
//Passo 2 – Calcular a soma entre todos os valores calculados no passo 1.
//
//Passo 3 – Dividir o valor obtido no passo 2 por 11.
// Essa divisão deve ser por inteiros (operador div ou ).
// Se o resto da divisão for menor que 2, o primeiro dígito verificador será 0.
// Caso contrário, subtrai-se de 11 o valor obtido.
// Por exemplo: se o resultado for 5, o dígito verificador será 11 − 5 = 6.
//
//Cálculo do Y
//
//O valor calculado para X será utilizado no cálculo do Y.
//
//Passo 1 – Multiplicar o dígito A por 11, o dígito B por 10, o dígito C por 9 e assim sucessivamente até o dígito X, que deverá ser multiplicado por 2.
//
//Passo 2 – Calcular a soma entre todos os valores calculados no passo 1.
//
//Passo 3 – Dividir o valor obtido no passo 2 por 11.
// Essa divisão deve ser por inteiros (operador div ou ).
// Se o resto da divisão for menor que 2, o segundo dígito verificador será 0.
// Caso contrário, subtrai-se de 11 o valor obtido. Por exemplo: se o resultado for 5, o dígito verificador será 11 − 5 = 6.
package exercicios.livros;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Digite o CPF (apenas números): ");
    String cpf = sc.nextLine();

    // Remove possíveis pontos e traço
    cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) {
        System.out.println("CPF inválido!");
        return;
    }

    int soma = 0;
    int peso = 10;

    // Cálculo do primeiro dígito (X)
        for (int i = 0; i < 9; i++) {
        int num = cpf.charAt(i) - '0';
        soma += num * peso;
        peso--;
    }

    int resto = soma % 11;
    int digito1;

        if (resto < 2) {
        digito1 = 0;
    } else {
        digito1 = 11 - resto;
    }

    // Cálculo do segundo dígito (Y)
    soma = 0;
    peso = 11;

        for (int i = 0; i < 10; i++) {
        int num;

        if (i == 9) {
            num = digito1;
        } else {
            num = cpf.charAt(i) - '0';
        }

        soma += num * peso;
        peso--;
    }

    resto = soma % 11;
    int digito2;

        if (resto < 2) {
        digito2 = 0;
    } else {
        digito2 = 11 - resto;
    }

    // Verificação final
    int d1 = cpf.charAt(9) - '0';
    int d2 = cpf.charAt(10) - '0';

        if (d1 == digito1 && d2 == digito2) {
        System.out.println("CPF válido!");
    } else {
        System.out.println("CPF inválido!");
    }

        sc.close();
}
}
