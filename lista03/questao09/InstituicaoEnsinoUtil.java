package lista03.questao09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstituicaoEnsinoUtil {
    public static final String[] estados = {
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
            "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
            "RS", "RO", "RR", "SC", "SP", "SE", "TO"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<InstituicaoEnsino> intituicoes = new ArrayList<>();
        boolean op = true;
        while (op) {
            try {
                System.out.println("Qual operação deseja realizar?");
                System.out.println("-----------OPERAÇOES-----------");
                System.out.println("-1) Inserir nova intituição   -");
                System.out.println("-2) Encerrar                  -");
                System.out.println("-------------------------------");
                int resp = Integer.parseInt(scanner.nextLine());
                if (resp > 2 || resp < 0) {
                    throw new Exception("Operação inválida.");
                }
                switch (resp) {
                    case 1:
                        try {
                            System.out.print("Insira o nome da instituição: ");
                            String nome = scanner.nextLine();
                            System.out.print("Insira a sigla da instituição: ");
                            String sigla = scanner.nextLine();
                            System.out.print("Insira a sigla do estado da instituição: ");
                            String siglaEstado = scanner.nextLine();
                            boolean estadoExiste = false;
                            for (String estado : estados) {
                                if (estado.equalsIgnoreCase(siglaEstado)) {
                                    estadoExiste = true;
                                    break;
                                }
                            }
                            if (!estadoExiste)
                                throw new Exception("Estado inválido!");
                            System.out.print("Essa instituição é pública? (s/n)");
                            String respPublica = scanner.nextLine();
                            boolean publica;
                            if(respPublica.equalsIgnoreCase("s"))
                                publica = true;
                            else if(respPublica.equalsIgnoreCase("n"))
                                publica = false;
                            else
                                throw new Exception("Resposta inválida!");
                            System.out.print("Insira a quantidade de cursos da instituição: ");
                            int quantidadeCursos = Integer.parseInt(scanner.nextLine());
                            if (quantidadeCursos < 1)
                                throw new Exception("Insira uma quantidade válida!");
                            InstituicaoEnsino novaIntituicao = new InstituicaoEnsino(nome, sigla, siglaEstado, publica, quantidadeCursos);
                            intituicoes.add(novaIntituicao);
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
        System.out.println(intituicoes);
    }
}
