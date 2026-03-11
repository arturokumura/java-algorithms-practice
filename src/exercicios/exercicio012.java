// Platform: Codewars
// Difficulty: 7kyu
// Problem: Get the middle character
package exercicios;

public class exercicio012 {
    public static String getMiddle(String word) {
        int meio = word.length() / 2;

        if (word.length() % 2 == 0) {
            return word.substring(meio - 1, meio + 1);
        } else {
            return word.substring(meio, meio + 1);
        }
    }
}
