import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario;

        if (salario <= 2000.00) {
            novoSalario = 00.00;


        } else if (salario <= 3000.00) {
            novoSalario = salario- 2000.00;
            novoSalario =  novoSalario * 0.08  ;

        } else if ( salario <= 4500.00) {
            novoSalario = salario - 3000.00;
            novoSalario = novoSalario * 0.18;
            novoSalario = novoSalario + 1000 * 0.08;
        }else {
            novoSalario = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
            if (novoSalario == 0.000){
                System.out.println(("Isento"));
            }else {

                System.out.printf("R$ %.2f",novoSalario);
            }

       }
    }
