package exercicios.hackerranq;

import java.util.List;

public class exercicio05 {
    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long somaTotal = 0;

        for (long num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
            somaTotal += num;
        }
        System.out.print(somaTotal - max + " " + (somaTotal - min));


    }

}


