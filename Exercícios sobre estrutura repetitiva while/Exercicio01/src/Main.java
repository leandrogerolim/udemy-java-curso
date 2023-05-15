import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois valores e aguarde o resultado da Soma: ");

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorTotal = valorA + valorB;

        System.out.println("Soma = " + valorTotal);
    }


}