import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int aux;
        int auxB;
        int valorMultiplo = valorB % valorA;
        if (valorMultiplo == 0) {

            System.out.println("São Múltiplos");



        } else if (valorA > valorB) {
            aux = valorB;
            auxB = valorA;
            valorMultiplo = auxB % aux;


            if (valorMultiplo == 0) {
                System.out.println("São Múltiplos");
            }else if (valorMultiplo != 0) {
                System.out.println("Não são Múltiplos");


            }
            }else{
            System.out.println("Não são Múltiplos");
        }
    }
}