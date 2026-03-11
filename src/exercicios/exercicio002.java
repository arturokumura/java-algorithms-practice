// Platform: Codewars
// Difficulty: 7kyu
// Problem: List Filtering

package exercicios;
import java.util.List;
import java.util.stream.Collectors;


public class exercicio002 {
    public static List<Object> filterList(final List<Object> list) {

        return list.stream()
                .filter(x -> x instanceof Integer) // mantém só inteiros
                .collect(Collectors.toList());
    }
}
