package lista02;

import java.util.Scanner;

public class DataUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = null;
        int d, m, a;
        //Questão 6
        boolean erro;
        do {
            try {
                erro = false;
                // entrada de dia, mês e ano de data
                System.out.print("Informe Dia (1-31): ");
                d = scanner.nextInt();

                System.out.print("Informe Mês (1-12): ");
                m = scanner.nextInt();

                System.out.print("Informe Ano.......: ");
                a = scanner.nextInt();

                // instanciação de objeto da classe Data
                data = new Data(d, m, a);
            } catch (DataIncorretaException e) {
                System.out.println("Data incorreta!");
                erro = true;
            }
        } while (erro);
        // invocação de métodos do objeto instanciado da classe Data
        System.out.println("\nData em formato DD/MM/AAAA.............: " + data.mostrarData());
        System.out.println("Quantidade de dias restantes para o ano: " +
                data.getDiasTerminoAno());
        scanner.close();
    }
}
