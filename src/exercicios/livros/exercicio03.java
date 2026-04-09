/*Considere a situação em que um cliente faz uma determinada compra em uma loja.
Ao realizar o pagamento, são-lhe oferecidas as seguintes condições para pagamento:

Pagamento à vista – 15% de desconto sobre o valor total da compra.
Pagamento com cheque pré-datado para 30 dias – 10% de desconto sobre o valor total da compra.
Pagamento parcelado em 3 vezes – 5% de desconto sobre o valor total da compra.
Pagamento parcelado em 6 vezes – não tem desconto.
Pagamento parcelado em 12 vezes – 8% de acréscimo sobre o valor total da compra.

De acordo com o valor total da compra, verifique a opção de pagamento do cliente,
calcule o valor final da compra e se a escolha for por pagamento parcelado, calcule também o valor das parcelas.

Apresente ao usuário uma mensagem com o valor total da compra, o valor final da compra, a diferença entre os dois,
identifique como desconto se a diferença for positiva, como juros se for negativa, mostre, também, a quantidade e o valor das parcelas.
 */

package exercicios.livros;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor total da compra: ");
        double valor_total = sc.nextDouble();
        System.out.println("-----------------------");
        System.out.println("Digite a forma de pagamento: ");
        System.out.println("[1] - Pagamento à vista: ");
        System.out.println("[2] - Pagamento com cheque pré-datado(30 dias): ");
        System.out.println("[3] - Pagamento parcelado(3x): ");
        System.out.println("[4] - Pagamento parcelado(6x sem juros): ");
        System.out.println("[5] - Pagamento parcelado(12x com juros): ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                double valor_final = valor_total * 0.85;
                double desconto = valor_final - valor_total;
                System.out.println("Valor final: " + valor_final);
                System.out.println("Desconto: " + desconto);
                break;

            case 2:
                valor_final = valor_total * 0.90;
                desconto = valor_final - valor_total;
                System.out.println("Valor final: " + valor_final);
                System.out.println("Desconto: " + desconto);
                break;

            case 3:
                valor_final = valor_total * 0.95;
                double parcelas = valor_final / 3;
                desconto = valor_final - valor_total;
                System.out.println("Valor final: " + valor_final);
                System.out.println("Desconto: " + desconto);
                System.out.println("Parcelas: 3x de R$ " + parcelas);
                break;

            case 4:
                valor_final = valor_total ;
                parcelas = valor_final / 6;
                desconto = 0;
                System.out.println("Valor final: " + valor_final);
                System.out.println("Desconto: " + desconto);
                System.out.println("Parcelas: 6x de R$ " + parcelas);
                break;

            case 5:
                valor_final = valor_total * 1.08;
                parcelas = valor_total / 12;
                desconto = valor_final - valor_total;
                System.out.println("Valor final: " + valor_final);
                if (desconto > 0){
                    System.out.println("Juros: " + desconto);
                }
                else {
                    System.out.println("Desconto: " + desconto);
                }
                System.out.println("Parcelas: 12x de R$ " + parcelas);
                break;

            default:
                System.out.println("Ocorreu um erro!");
        }
    }
}
