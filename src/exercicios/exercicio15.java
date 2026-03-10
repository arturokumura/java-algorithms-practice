// Platform: Codewars
// Difficulty: 8kyu
// Problem: Sum of Arrays
package exercicios;

public class exercicio15 {
    public static double sum(double[] numbers) {
        if(numbers.length == 0) {
            return 0;
        }
        else {
            double sum = 0;
            for(int i=0; i< numbers.length; i++) {
                sum = sum+ numbers[i];
            }
            return sum;
        }
    }
}
