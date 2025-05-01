import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidatoUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Candidato> c = new ArrayList<>(10);
        boolean op = true;
        while (op) {
            try {
                System.out.println("O que deseja realizar?");
                System.out.println("---------OPERACAO---------");
                System.out.println("1) Adicionar candidato    ");
                System.out.println("2) Encerrar               ");
                System.out.println("--------------------------");
                int resp = scanner.nextInt();
                scanner.nextLine();

                switch (resp) {
                    case 1:
                        try {
                            System.out.println("Informe o nome do candidato: ");
                            String nome = scanner.nextLine();

                            System.out.println("Informe o numero do candidato: ");
                            int numero = Integer.parseInt(scanner.nextLine());

                            System.out.println("Informe a idade do candidato: ");
                            int idade = Integer.parseInt(scanner.nextLine());

                            System.out.println("Informe o cargo do candidato: ");
                            String cargo = scanner.nextLine();
                            
                            c.add(new Candidato(numero, nome, idade, cargo));
                        } catch (Exception e) {
                            System.out.println("Candidato inválido");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("Esses são os candidatos inscritos: ");
                        for (Candidato candidato : c) {
                            System.out.println("--------------------");
                            System.out.println(candidato.toString());
                        }
                        System.out.println("--------------------");
                        op = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;                }
            } catch (Exception e) {
                System.out.println("Operação inválida");
            }
        }
        scanner.close();

    }
}
