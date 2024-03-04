import java.util.Locale;
import java.util.Scanner;

public class ContadorDeSalarios {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Calculo de salário

        double a;
        int b;
        double horasTrabalhadas, salario;

        System.out.print("Digite o numero de horas trabalhadas: ");
        a = sc.nextInt();
        b = 25;

        horasTrabalhadas = a;
        salario = a * b;

        System.out.println("Horas Trabalhadas = " + horasTrabalhadas);
        System.out.printf("Salario = R$ %.2f%n", salario);

        sc.close();
    }
}