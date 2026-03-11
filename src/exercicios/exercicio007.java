// Platform: Codewars
// Difficulty: 7kyu
// Problem: Square Every Digit

package exercicios;

public class exercicio007 {
    public int squareDigits(int n) {
        return Integer.parseInt(
                String.valueOf(n)
                        .chars()
                        .map(c -> Character.getNumericValue(c))
                        .map(d -> d * d)
                        .mapToObj(String::valueOf)
                        .reduce("", String::concat)
        );
    }
}

