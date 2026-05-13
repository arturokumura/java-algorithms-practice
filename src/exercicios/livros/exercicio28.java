
package exercicios.livros;
//Selection sort
public class exercicio28 {
    public static void main (String[] args) {
        int [] numeros = {21, 5, 7, 9, 15, 12, 1, 3};
        int menor, x;
        for (int i = 0; i < numeros.length -1; i++) {
            menor = i;
            x = numeros[i];

            for (int j = i + 1; j < numeros.length ; j ++) {
                if (numeros[j] < x) {
                    menor = j;
                    x = numeros[j];
                }
            }
            numeros[menor] = numeros[i];
            numeros[i] = x;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
