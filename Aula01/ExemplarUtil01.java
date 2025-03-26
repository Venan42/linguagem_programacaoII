import java.util.Arrays;
import java.util.Scanner;

public class ExemplarUtil01 {

	static final int MAX = 2; // quantidade de exemplares

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // fluxo para operações de entrada
		Exemplar[] acervo = new Exemplar[MAX]; // array de exemplares baseada em quantidade definida anteriormente
		Integer[] tombos = new Integer[MAX];

		// entrada de dados de exemplares
		for (int i = 0; i < MAX; i++) {
			// entrada de número de tombo de enésimo exemplar
			System.out.printf("Tombo do Exemplar %d: ", i + 1);
			int tombo = scanner.nextInt();
			scanner.nextLine(); // descarte de caracteres não processados em última operação de entrada
			
			while(Arrays.asList(tombos).contains(tombo)){
				System.out.println("Tombo já existente! Informe outro.");
				System.out.printf("Tombo do Exemplar %d: ", i + 1);
				tombo = scanner.nextInt();
			}
	

			// entrada de título de enésimo exemplar
			System.out.printf("Título do Exemplar %d: ", i + 1);
			String titulo = scanner.nextLine();

			// entrada de nomes de autores de enésimo exemplar
			System.out.printf("Autoria do Exemplar %d: ", i + 1);
			String autoria = scanner.nextLine();

			// entrada de indicativo de enésimo exemplar estar apto (S) ou não (N) a ser
			// emprestado
			System.out.printf("Exemplar %d apto a ser emprestado (S/N)? ", i + 1);
			boolean aptoEmprestimo = scanner.nextLine().equalsIgnoreCase("s");

			// instanciação de enésimo objeto da classe Exemplar e armazenamento de
			// referência em enésimo índice do array
			acervo[i] = new Exemplar(tombo, titulo, autoria, aptoEmprestimo);
		}

		int aux;
		do {
			System.out.println("----------------AÇÕES----------------");
			System.out.println("- 1) Habilitar emprestimo           -");
			System.out.println("- 2) Desabilitar emprestimo         -");
			System.out.println("- 3) Novo empréstimo                -");
			System.out.println("- 4) Imprimir empréstimos           -");
			System.out.println("- 5) Exemplar com mais empréstimos  -");
			System.out.println("- 6) Encerrar                       -");
			System.out.println("-------------------------------------");

			System.out.print("Insira a operação: ");
			aux = scanner.nextInt();

			int ex;
			switch (aux) {
				case 1:
					System.out.println("Qual o número do exemplar que será alterado?");
					ex = scanner.nextInt();

					acervo[ex - 1].habilitarEmprestimo();
					break;

				case 2:
					System.out.println("Qual o número do exemplar que será alterado?");
					ex = scanner.nextInt();

					acervo[ex - 1].desabilitarEmprestimo();
					break;

				case 3:
					System.out.println("Qual o número do exemplar que será alterado?");
					ex = scanner.nextInt();

					if (acervo[ex - 1].isAptoEmprestimo()) {
						acervo[ex - 1].adicionarEmprestimo();
					} else  {
						System.err.println("Exemplar não disponível para empréstimo!");
					}

					break;

				case 4: 
					int totalEmp = 0;
					for(int i = 0; i <MAX; i++){
						totalEmp += acervo[i].getEmprestimos();
					}
					System.out.println("O total de emprestimos de todos os exemplares é: " + totalEmp);
					break;

				case 5:
					int maiorEmp = 0;
					Exemplar exemplar;
					for(int i = 0; i <MAX; i++){
						if (acervo[i].getEmprestimos() > maiorEmp){
							maiorEmp = acervo[i].getEmprestimos();
						}
					}

					if (maiorEmp == 0){				
						System.out.println("Não há registro de nenhum empréstimo ainda!");
					} else {								
						System.out.println("Exemplares com maior quantidade de empréstimos (" + maiorEmp + "):");
                            for (Exemplar acervo1 : acervo) {
                                if (acervo1.getEmprestimos() == maiorEmp) {
                                    System.out.println(acervo1.getTitulo() + " (" + acervo1.getAutores() + ")");
                                }
                            }
					}

					break;

				default:
					throw new AssertionError();
			}
		} while (aux != 6);

		scanner.close();
	}
}
