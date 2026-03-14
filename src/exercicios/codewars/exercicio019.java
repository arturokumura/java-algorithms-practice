// Platform: Codewars
// Difficulty: 7kyu
// Problem: Number of People in the Bus

package exercicios.codewars;

import java.util.List;

public class exercicio019 {
    public static int countPassengers(List<int[]> stops) {

        int pessoas = 0;

        for (int[] parada : stops) {
            pessoas += parada[0];
            pessoas -= parada[1];
        }

        return pessoas;
    }
}
