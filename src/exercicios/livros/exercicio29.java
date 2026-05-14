package exercicios.livros;

public class exercicio29 {
    public static void main(String[] args) {
        int [] vect = {23,5,4,9,13,43,4,22,2,1};
        int x;
        for (int i = 1; i< vect.length; i++) {
            for (int j = vect.length-1; j >= i; j--) {
                if (vect[j-1] > vect[j]){
                    x = vect[j-1];
                    vect[j -1] = vect[j];
                    vect[j] = x;
                }
            }
        }
        for (int c : vect) {
            System.out.println(c);
        }
    }
}
