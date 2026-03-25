package exercicios.hackerranq;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        String nova = S.substring(start,end);
        System.out.print(nova);
    }
}
