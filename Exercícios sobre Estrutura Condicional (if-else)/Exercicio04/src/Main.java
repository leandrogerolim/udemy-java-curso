import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();


        int horaTotal = horaFinal - horaInicio;

        System.out.println(horaTotal);
    }
}