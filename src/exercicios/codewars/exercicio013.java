// Platform: Codewars
// Difficulty: 8kyu
// Problem: "You only need one - Beginner"


package exercicios.codewars;

public class exercicio013 {

public static boolean check(Object[] a, Object x) {
    for (Object obj : a) {
        if (obj.equals(x)) {
            return true;
        }
    }
    return false;
}
}
