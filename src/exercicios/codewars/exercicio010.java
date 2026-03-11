// Platform: Codewars
// Difficulty: 7kyu
// Problem: Parts of List

package exercicios.codewars;

import java.util.Arrays;

public class exercicio010 {
    public static String[][] partlist(String[] arr) {
        // Criamos a matriz que armazenará o resultado
        // Teremos arr.length - 1 divisões possíveis
        // Cada divisão tem 2 partes: esquerda e direita
        String[][] result = new String[arr.length - 1][2];

        // Loop que define o ponto onde a frase será dividida
        for (int i = 1; i < arr.length; i++) {

            // Copia as palavras da posição 0 até i-1
            // Depois junta todas com espaço
            result[i - 1][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i));

            // Copia as palavras da posição i até o final
            // Depois junta todas com espaço
            result[i - 1][1] = String.join(" ", Arrays.copyOfRange(arr, i, arr.length));
        }

        // Retorna a matriz com todas as divisões
        return result;
    }
}
