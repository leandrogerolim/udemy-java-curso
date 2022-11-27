import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o número do funcionario, o total de horas e o valor de cada hora");
        Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      int funcionario = sc.nextInt();
      int horasTotal = sc.nextInt();
      double valorHora = sc.nextDouble();

      double salario = horasTotal * valorHora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f",salario);
    }
}