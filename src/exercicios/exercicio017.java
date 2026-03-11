// Platform: Codewars
// Difficulty: 8kyu
// Problem: Separar conjuntos de pares/impares de um array

package exercicios;

import java.util.*;

public class exercicio017 {
    public static int[] menFromBoys(final int[] values) {
        Set<Integer> pares = new TreeSet<>();
        Set<Integer> impares = new TreeSet<>(Collections.reverseOrder());

        if (values.length < 4) return null;
        else {
            for (int v : values) {
                if (v % 2 == 0) {
                    pares.add(v);
                } else {
                    impares.add(v);
                }
            }
            List<Integer> resultado = new ArrayList<>();
            resultado.addAll(pares);
            resultado.addAll(impares);

            return resultado.stream().mapToInt(Integer::intValue).toArray();

        }
    }
}
