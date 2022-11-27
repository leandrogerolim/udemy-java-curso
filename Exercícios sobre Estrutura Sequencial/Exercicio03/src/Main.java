import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe 4 valores: ");

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();

        int valorTotal = (valorA * valorB) - (valorC * valorD);

        System.out.println("DIFERENÇA = " + valorTotal);
    }
}