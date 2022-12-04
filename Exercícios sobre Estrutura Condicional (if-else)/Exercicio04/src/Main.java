import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();

        int total;

        if (horaInicio < horaFinal) {
            total = horaFinal - horaInicio;
            System.out.println("O JOGO DUROU " + total +" HORA(S);");

        } else {

            total = 24 - horaInicio + horaFinal;

            System.out.println("O JOGO DUROU " + total +" HORA(S);");
        }
    }
}