// Platform: Codewars
// Difficulty: 7kyu
// Problem: Descending Order


package exercicios;
import java.util.Arrays;
public class exercicio3 {
    public static int sortDesc(final int num) {

        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        return Integer.parseInt(
                new StringBuilder(new String(digits))
                        .reverse()
                        .toString()
        );
    }
}
