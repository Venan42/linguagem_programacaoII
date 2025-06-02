package lista03.questao05;

import lista02.Conta;

import java.util.*;

public class ContatoUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();
        boolean op = true;
        while (op) {
            try {
                System.out.println("Qual operação deseja realizar?");
                System.out.println("----------OPERAÇOES----------");
                System.out.println("-1) Inserir novo contato    -");
                System.out.println("-2) Mostrar contatos por ano-");
                System.out.println("-3) Encerrar                -");
                System.out.println("-----------------------------");
                int resp = Integer.parseInt(scanner.nextLine());
                if (resp > 3 || resp < 0) {
                    throw new Exception("Resposta inválida.");
                }
                switch (resp) {
                    case 1:
                        try {
                            System.out.print("Insira o nome do contato: ");
                            String nome = scanner.nextLine();
                            System.out.print("Insira o telefone do contato: ");
                            long telefone = Integer.parseInt(scanner.nextLine());
                            System.out.println("Insira o dia de nascimento do contato: ");
                            int dia = Integer.parseInt(scanner.nextLine());
                            System.out.println("Insira o mes de nascimento do contato: ");
                            int mes = Integer.parseInt(scanner.nextLine()) - 1;
                            System.out.println("Insira o ano de nascimento do contato: ");
                            int ano = Integer.parseInt(scanner.nextLine());
                            if(ano > 2025)
                                throw new Exception();
                            GregorianCalendar nascimento = new GregorianCalendar(ano, mes, dia);
                            Contato novoContato = new Contato(nome, telefone, nascimento);
                            contatos.add(novoContato);
                            System.out.println("Contato adicionado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Algum dado inserido está incorreto.");
                        }
                        break;
                    case 2:
                        System.out.println("Qual ano deseja buscar?");
                        List<Contato> contatosPorAno = new ArrayList<>();
                        int ano = scanner.nextInt();
                        for (Contato contato : contatos){
                            if(contato.getDataNascimento().get(Calendar.YEAR) == ano){
                                contatosPorAno.add(contato);
                            }
                        }
                        System.out.println(contatosPorAno);
                        break;
                    case 3:
                        System.out.println("Tchau!");
                        op = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
