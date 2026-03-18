package exercicios.hackerranq;

import java.util.List;

public class exercicio08 {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maior = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > maior) {
                maior = candle;
                count = 1;
            } else if (candle == maior) {
                count++;
            }
        }

        return count;
    }
}
