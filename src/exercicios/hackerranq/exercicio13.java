package exercicios.hackerranq;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int tamA = A.length();
        int tamB = B.length();
        int tamt = tamA + tamB;

        String pa = A.substring(0,1);
        String restoa = A.substring(1);
        String pb = B.substring(0,1);
        String restob = B.substring(1);

        System.out.println(tamt);


        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        System.out.println(pa.toUpperCase()+ restoa +" " + pb.toUpperCase()+ restob);
    }
}
