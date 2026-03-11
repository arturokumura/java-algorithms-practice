// Platform: Codewars
// Difficulty: 7kyu
// Problem: Basic calculator

package exercicios.codewars;

public class exercicio011 {
    public static Double calculate(final double a, final String operator, final double b) {
        switch(operator) {
            case("+") :
                return a + b;


            case( "-"):
                return a - b;


            case( "*") :
                return a*b;


            case("/") :
                if(b!= 0) {
                    return a/b;
                }
                return null;

            default:
                return null;

        }
    }
}
