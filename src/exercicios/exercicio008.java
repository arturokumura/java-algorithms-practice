
// Platform: Codewars
// Difficulty: 7kyu
// Problem: Search for letters


package exercicios;

import java.util.stream.IntStream;

public class exercicio008 {
    public static String search(String line){

        String lower = line.toLowerCase();


        return IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> lower.indexOf(c) >= 0 ? "1" : "0")
                .reduce("", String::concat);
    }
}
