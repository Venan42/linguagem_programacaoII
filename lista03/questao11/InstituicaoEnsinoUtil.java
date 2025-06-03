package lista03.questao10;

import lista03.questao09.InstituicaoEnsino;

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
        List<InstituicaoEnsino> instituicoes = new ArrayList<>();
        boolean op = true;
        while (op) {
            try {
                System.out.println("Qual operação deseja realizar?");
                System.out.println("--------------OPERAÇOES--------------");
                System.out.println("-1) Inserir nova intituição         -");
                System.out.println("-2) Listar instituições públicas    -");
                System.out.println("-3) Listar intituições privadas     -");
                System.out.println("-4) Qtd de públicas e de privadas   -");
                System.out.println("-5) Listar todas as instituições    -");
                System.out.println("-6) Encerrar                        -");
                System.out.println("-- ----------------------------------");
                int resp = Integer.parseInt(scanner.nextLine());
                if (resp > 6 || resp < 0) {
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
                            if (respPublica.equalsIgnoreCase("s"))
                                publica = true;
                            else if (respPublica.equalsIgnoreCase("n"))
                                publica = false;
                            else
                                throw new Exception("Resposta inválida!");
                            System.out.print("Insira a quantidade de cursos da instituição: ");
                            int quantidadeCursos = Integer.parseInt(scanner.nextLine());
                            if (quantidadeCursos < 1)
                                throw new Exception("Insira uma quantidade válida!");
                            InstituicaoEnsino novaIntituicao = new InstituicaoEnsino(nome, sigla, siglaEstado, publica, quantidadeCursos);
                            instituicoes.add(novaIntituicao);
                            System.out.println("Aluno adicionado com sucesso!");
                        } catch (NumberFormatException e) {
                            System.out.println("Coloque um número!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        List<InstituicaoEnsino> instituicoesPublicas = new ArrayList<>();
                        for (InstituicaoEnsino instituicao : instituicoes) {
                            if (instituicao.isPublica())
                                instituicoesPublicas.add(instituicao);
                        }
                        System.out.println(instituicoesPublicas);
                        break;
                    case 3:
                        List<InstituicaoEnsino> instituicoesPrivadas = new ArrayList<>();
                        for (InstituicaoEnsino instituicao : instituicoes) {
                            if (!instituicao.isPublica())
                                instituicoesPrivadas.add(instituicao);
                        }
                        System.out.println(instituicoesPrivadas);
                        break;
                    case 4:
                        System.out.print("Digite a sigla do estado: ");
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
                        int instituicoesPublicasPorEstado = 0;
                        int instituicoesPrivadasPorEstado = 0;
                        for (InstituicaoEnsino instituicao : instituicoes) {
                            if (instituicao.isPublica() && instituicao.getSiglaEstado().equalsIgnoreCase(siglaEstado))
                                instituicoesPublicasPorEstado++;
                            else if(!instituicao.isPublica() && instituicao.getSiglaEstado().equalsIgnoreCase(siglaEstado))
                                instituicoesPrivadasPorEstado++;
                        }
                        System.out.println("Quantidade de instituições públicas de " + siglaEstado +": " + instituicoesPublicasPorEstado);
                        System.out.println("Quantidade de instituições privadas de " + siglaEstado +": " + instituicoesPrivadasPorEstado);
                        break;
                    case 5:
                        for(InstituicaoEnsino instituicao : instituicoes){
                            System.out.println(instituicao);
                        }
                        break;
                    case 6:
                        System.out.println("Tchau!");
                        op = false;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + resp);
                }
            } catch (NumberFormatException e) {
                System.out.println("Coloque um número!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(instituicoes);
    }
}
