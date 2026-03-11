// Platform: Codewars
// Difficulty: 7kyu
// Problem: Maximum product

package exercicios.codewars;

public class exercicio009 {
    public int adjacentElementsProduct(int[] array) {
    int maior = array[0] * array[1];

    for(int i=1;i<array.length -1 ; i++) {
        int multiplication = array[i] * array[i + 1];

        if(multiplication > maior) {
            maior = multiplication;
        }

    }
    return maior;
}
}
