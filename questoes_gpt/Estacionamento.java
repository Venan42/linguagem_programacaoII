import java.util.InputMismatchException;
import java.util.Scanner;

public class Estacionamento {
    private VagaEstacionamento[] vagas;
    private int tamanho;

    public Estacionamento(int tamanho) {
        this.vagas = new VagaEstacionamento[tamanho];
        this.tamanho = tamanho;
    
        for (int i = 0; i < tamanho; i++) {
            vagas[i] = new VagaEstacionamento(false, null);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaOcupado(int vaga){
        return vagas[vaga].getOcupacao();
    }

    public void ocuparVaga(String placa) throws Exception{
        int vaga = getProximaVaga();
        if(vaga == -1){
            throw new Exception("Estacionamento lotado!");
        }

        vagas[vaga].setOcupacao(true);
        vagas[vaga].setPlacaVeiculo(placa);
        System.out.println("Vaga ocupada com sucesso!");

    }

    public void desocuparVaga(int vaga) throws Exception{
        if (vaga < 0 || vaga >= tamanho) {
            throw new Exception("Vaga inválida!");
        }

        vagas[vaga].setOcupacao(false);
        vagas[vaga].setPlacaVeiculo(null);
        System.out.println("Vaga desocupada com sucesso!");
    }

    public double getTaxaOcupacao() {
        int ocupadas = 0;
        for (VagaEstacionamento v : vagas) {
            if (v.getOcupacao()) ocupadas++;
        }
        return (ocupadas * 100.0) / tamanho;
    }

    public String getPlaca(int vaga){
        return vagas[vaga].getPlacaVeiculo();
    }


    public int getProximaVaga() {
        int aux = -1;
        for(int i = 0; i < tamanho; i++){
            if(!vagas[i].getOcupacao()){
                aux = i;
            }
        }

        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = null;

        // Inicializar o estacionamento
        while (true) {
            try {
                System.out.print("Informe o número total de vagas do estacionamento: ");
                int total = sc.nextInt();
                if (total <= 0) throw new Exception("Número inválido!");
                estacionamento = new Estacionamento(total);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro válido.");
                sc.next(); // limpa o buffer
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        int opcao = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar vaga");
            System.out.println("2 - Ocupar vaga automaticamente");
            System.out.println("3 - Liberar vaga");
            System.out.println("4 - Ver taxa de ocupação");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Informe o número da vaga (0 a " + (estacionamento.getTamanho() - 1) + "): ");
                        int n = sc.nextInt();
                        boolean ocupado = estacionamento.estaOcupado(n);
                        if (ocupado) {
                            System.out.println("Vaga ocupada pela placa: " +
                                    estacionamento.getPlaca(n));
                        } else {
                            System.out.println("Vaga livre.");
                        }
                    }

                    case 2 -> {
                        sc.nextLine(); // limpar quebra de linha
                        System.out.print("Digite a placa do veículo: ");
                        String placa = sc.nextLine();
                        estacionamento.ocuparVaga(placa);
                    }

                    case 3 -> {
                        System.out.print("Informe o número da vaga a liberar: ");
                        int n = sc.nextInt();
                        estacionamento.desocuparVaga(n);
                    }

                    case 4 -> {
                        double taxa = estacionamento.getTaxaOcupacao();
                        System.out.printf("Taxa de ocupação: %.2f%%%n", taxa);
                    }

                    case 5 -> System.out.println("Encerrando o sistema...");
                    default -> System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Número de vaga inválido.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 5);

        sc.close();
    }

}
