package exercicios.livros;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean divisivel =verificar_divisivel(a,b);
        System.out.print(divisivel);
    }
    static boolean verificar_divisivel(int a, int b) {
        if (a % b == 0|| b % a == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
