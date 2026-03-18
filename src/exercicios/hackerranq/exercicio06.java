package exercicios.hackerranq;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();

        int a = B * H ;

        if(B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(a);
        }
    }
}
