// Platform: Codewars
// Difficulty: 7kyu
// Problem: friend or foe?

package exercicios.codewars;

import java.util.List;
import java.util.stream.Collectors;

public class exercicio020 {
    public static List<String> friend(List<String> x){
        return x.stream()
                .filter(name -> name.length() == 4)
                .collect(Collectors.toList());
    }
}
