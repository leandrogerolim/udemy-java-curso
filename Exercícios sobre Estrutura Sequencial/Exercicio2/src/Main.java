import java.util.Locale;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o valor do raio: ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double area = sc.nextDouble();
        double raio =Math.pow(area , 2);
        double valorTotal = 3.14159 *raio;

        System.out.printf("A = %.4f ", valorTotal);
    }
}