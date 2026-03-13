package exercicios.hackerranq;

import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for( int num : arr) {
            if( num > 0) {
                positive +=  1;
            }
            else if( num < 0) {
                negative += 1;
            }
            else {
                zero += 1;
            }
        }

        double n = arr.size();

        double fracaop = positive / n;
        double fracaon = negative/n;
        double fracaoz = zero/n;

        System.out.println(fracaop);
        System.out.println(fracaon);
        System.out.println(fracaoz);

    }

}

