// Platform: Codewars
// Difficulty: 8kyu
// Problem: remove BMW
package exercicios;

public class exercicio16 {
    public static String removeBMW(Object input) {
        if (!(input instanceof String)) {
            throw new IllegalArgumentException("This program only works for text.");
        } else {
            return ((String) input).replaceAll("(?i)[bmw]", "");
        }
    }
}
