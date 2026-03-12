package exercicios.hackerranq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class exercicio1 {
    public class Solution {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = sc.nextInt();
            for(int i=1; i<= 10; i++ ) {
                int result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }

            bufferedReader.close();
        }
    }
}
