// Platform: Codewars
// Difficulty: 8kyu
// Problem: Pythagorean Triple

package exercicios.codewars;

import java.util.Arrays;

public class exercicio018 {
        public int pythagoreanTriple(int[] triple){
            Arrays.sort(triple);

            if (triple[2] * triple[2] == (triple[1] * triple[1] + triple[0] * triple[0])) {
                return 1;
            }
            return 0;
        }
    }

