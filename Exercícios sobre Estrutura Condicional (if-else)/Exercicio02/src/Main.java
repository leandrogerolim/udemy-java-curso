import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInformado = sc.nextInt();

        int valor = valorInformado % 2;

        if (valor ==  0) {
            System.out.println("PAR!");
        }else {
                System.out.println("IMPAR!");
    }
}
}
