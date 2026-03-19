package exercicios.hackerranq;

import java.util.ArrayList;
import java.util.List;

public class exercicio12 {
    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> resultado = new ArrayList<>();

        for (int grade : grades) {

            if (grade < 38) {
                resultado.add(grade);
            } else {
                int resto = grade % 5;

                if (resto >= 3) {
                    grade += (5 - resto);
                }

                resultado.add(grade);
            }
        }

        return resultado;
    }
}
