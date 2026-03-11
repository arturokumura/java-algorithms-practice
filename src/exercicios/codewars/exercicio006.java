// Platform: Codewars
// Difficulty: 7kyu
// Problem: Credit Card Mask

package exercicios.codewars;

public class exercicio006 {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;

        int corte = str.length() - 4;
        return "#".repeat(corte) + str.substring(corte);
    }
}
