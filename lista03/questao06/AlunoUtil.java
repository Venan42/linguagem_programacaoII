package lista03.questao06;

import java.util.*;

public class AlunoUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        boolean op = true;
        while (op) {
            try {
                System.out.println("Qual operação deseja realizar?");
                System.out.println("-----------OPERAÇOES-----------");
                System.out.println("-1) Inserir novo aluno        -");
                System.out.println("-2) Encerrar                  -");
                System.out.println("-------------------------------");
                int resp = Integer.parseInt(scanner.nextLine());
                if (resp > 2 || resp < 0) {
                    throw new Exception("Operação inválida.");
                }
                switch (resp) {
                    case 1:
                        try {
                            System.out.print("Insira a matrícula do aluno: ");
                            int matricula = Integer.parseInt(scanner.nextLine());
                            System.out.print("Insira o nome do aluno: ");
                            String nome = scanner.nextLine();
                            System.out.print("Insira o sexo do aluno: ");
                            String sexo = scanner.nextLine();
                            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
                                throw new Exception("Sexo inválido!");
                            System.out.print("Insira o curso do aluno: ");
                            String curso = scanner.nextLine();
                            System.out.print("Insira o ano de ingresso do aluno: ");
                            int anoIngresso = Integer.parseInt(scanner.nextLine());
                            if (anoIngresso > 2025)
                                throw new Exception("Ano não pode ser maior que o atual!");
                            System.out.print("Insira o semestre de ingresso do aluno: ");
                            int semestreIngresso = Integer.parseInt(scanner.nextLine());
                            if (semestreIngresso != 1 && semestreIngresso != 2)
                                throw new Exception("Semestre inválido!");
                            Aluno novoAluno = new Aluno(matricula, nome, sexo, curso, anoIngresso, semestreIngresso);
                            alunos.add(novoAluno);
                            System.out.println("Aluno adicionado com sucesso!");
                        } catch (NumberFormatException e) {
                            System.out.println("Coloque um número!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Tchau!");
                        op = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Coloque um número!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(alunos);
    }
}
