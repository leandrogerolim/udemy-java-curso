import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale .setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        if (eixoX == 0.00 && eixoY == 00.00) {
            System.out.println("Origem");

        }else if (eixoX >=0.1 && eixoX <=10.00 && eixoY >=0.1 && eixoY <=10.00) {

            System.out.println("Q1");

        }else if (eixoX >=0.1 && eixoX <=10.00 && eixoY <= -0.1 && eixoY >= -10.00) {
            System.out.println("Q4");

        }else if (eixoY >=0.1 && eixoY <=10.00 && eixoX <= -0.1 && eixoX >= -10.00) {

            System.out.println("Q2");
        }else if (eixoX <= -0.1 && eixoX >=-10.00 && eixoY <= -0.1 && eixoY >= -10.00) {
            System.out.println("Q3");
        }else{
            System.out.println("Valor fora do Intervalo");
        }
    }
}