import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int item1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        double total1 = quantidade1 * valor1;
        System.out.println("Proxímo item, digite o código, quantidade e valor unitário: ");

        int item2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        double total2 = quantidade2 * valor2;

        double valorTotal = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f" , valorTotal);


    }
}