import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale .setDefault(Locale.US);

        int codigoProduto = sc.nextInt();
        int quantidadeProduto = sc.nextInt();

        if (codigoProduto == 1) {
            double valorProduto = 4;

            double valototal = quantidadeProduto * valorProduto;

            System.out.printf("Total: R$ %.2f",valototal);
        } else if (codigoProduto == 2) {
            double valorProduto = 4.50;

            double valototal = quantidadeProduto * valorProduto;
            System.out.printf("Total: R$ %.2f",valototal);
        } else if (codigoProduto == 3) {
            double valorProduto = 5.00;

            double valototal = quantidadeProduto * valorProduto;
            System.out.printf("Total: R$ %.2f",valototal);


        } else if (codigoProduto == 4) {
            double valorProduto = 2.00;

            double valototal = quantidadeProduto * valorProduto;
            System.out.printf("Total: R$ %.2f",valototal);

        } else if (codigoProduto == 5) {
            double valorProduto = 1.50;

            double valototal = quantidadeProduto * valorProduto;
            System.out.printf("Total: R$ %.2f",valototal);
        } else {
            System.out.println("Código inválido insira um valor entre 1 e 5");
        }
    }
}