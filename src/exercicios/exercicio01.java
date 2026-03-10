// Platform: Codewars
// Difficulty: 8kyu
// Problem: Enumerable Magic #1 - True for All?


package exercicios;
import java.util.function.IntPredicate;

public class exercicio01 {
    public static boolean all(int[] list, IntPredicate predicate){
        for (int number : list) {
            if (!predicate.test(number)) {
                return false;
            }
        }

        return true;

    }
}
