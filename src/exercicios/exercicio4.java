// Platform: Codewars
// Difficulty: 7kyu
// Problem: Take a Ten Minutes Walk

package exercicios;

public class exercicio4 {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;

        for (char c : walk) {
            if (c == 'n') y++;
            else if (c == 's') y--;
            else if (c == 'e') x++;
            else if (c == 'w') x--;
        }

        return x == 0 && y == 0;
    }
}
