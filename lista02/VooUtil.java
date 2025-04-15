package lista02;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class VooUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voo v1 = new Voo(1, gerarHorarioAleatorio(), 100);
        boolean x = true;
        while(x){
            System.out.println("Qual operação você quer realizar?");
            System.out.println("---------OPERAÇÕES---------");
            System.out.println("- 1) Checar assento       -");
            System.out.println("- 2) Reservar assento     -");
            System.out.println("- 3) Quantas vagas restam?-");
            System.out.println("- 4) Encerrar programa    -");
            System.out.println("---------------------------");

            System.out.println("Insira a operação(1-4): ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Qual assento você quer checar a disponibilidade?");
                        int n = scanner.nextInt();
                        if(v1.isAssentoLivre(n))
                            System.out.println("Assento está disponível!");
                        else 
                            System.out.println("Assento não está disponível!");
                    } catch (Exception e) {
                        System.out.println("Assento não existe!");
                    }
                    
                    break;

                case 2: 
                    try {
                        System.out.println("Qual assento você quer ocupar?");
                        int n = scanner.nextInt();
                        if(!v1.ocuparAssento(n)){
                            System.out.println("Assento já está ocupado!");
                        } else {
                            System.out.println("Assento ocupado com sucesso!");
                        }
                    } catch (Exception e) {
                        System.out.println("Assento indisponível!");
                    }

                    break;
                case 3:
                    System.out.println("Ainda existem " + v1.getTotalAssentosLivres() + " assentos livres!");
                    break;
                case 4: 
                    x = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    public static Date gerarHorarioAleatorio() {
        Calendar agora = Calendar.getInstance();

        // Arredonda para o próximo múltiplo de 15 minutos
        int minutos = agora.get(Calendar.MINUTE);
        int incremento = 15 - (minutos % 15);
        agora.add(Calendar.MINUTE, incremento);

        // Define o limite (ex: 23:45)
        Calendar limite = Calendar.getInstance();
        limite.set(Calendar.HOUR_OF_DAY, 23);
        limite.set(Calendar.MINUTE, 45);
        limite.set(Calendar.SECOND, 0);
        limite.set(Calendar.MILLISECOND, 0);

        // Quantos blocos de 15min há entre agora e o limite?
        long diffMillis = limite.getTimeInMillis() - agora.getTimeInMillis();
        int blocos = (int) (diffMillis / (15 * 60 * 1000));

        if (blocos <= 0)
            return agora.getTime(); // Sem espaço

        // Gera um número aleatório de blocos de 15min
        int addBlocos = new Random().nextInt(blocos + 1);
        agora.add(Calendar.MINUTE, addBlocos * 15);

        return agora.getTime();
    }

}
