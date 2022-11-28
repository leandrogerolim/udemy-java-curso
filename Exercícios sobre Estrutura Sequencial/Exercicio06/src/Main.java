import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double valorA = sc.nextDouble();
        double valorB = sc.nextDouble();
        double valorC = sc.nextDouble();

        double triangulo = valorA * valorC / 2;
        double circulo =  3.14159 * (valorC * valorC);
        double trapezio = (valorC * (valorA + valorB)) / 2;
        double quadrado = valorB * valorB ;
       double retangulo = valorA * valorB ;

        System.out.printf("TRIANGULO: %.3f%n",triangulo);
        System.out.printf("CÍRCULO: %.3f%n",circulo);
        System.out.printf("TRAPÉZIO: %.3f%n",trapezio);
        System.out.printf("QUADRADO: %.3f%n",quadrado);
        System.out.printf("RETANGULO: %.3f%n",retangulo);

    }
}