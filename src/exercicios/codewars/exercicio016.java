// Platform: Codewars
// Difficulty: 8kyu
// Problem: remove BMW
package exercicios.codewars;

public class exercicio016 {
    public static String removeBMW(Object input) {
        if (!(input instanceof String)) {
            throw new IllegalArgumentException("This program only works for text.");
        } else {
            return ((String) input).replaceAll("(?i)[bmw]", "");
        }
    }
}
