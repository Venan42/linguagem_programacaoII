package lista02;

import java.util.Scanner;

public class ContaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        Conta conta = null;
        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble(); // entrada de saldo mínimo de conta
        conta = new Conta(valor); // inicialização de objeto da classe Conta

        System.out.print("\nInforme Depósito Inicial: ");
        valor = scanner.nextDouble(); // entrada de valor de depósito inicial da conta
        conta.depositar(valor); // operação de depósito
        
        //Questão 02
        while(true){
            try {
                System.out.print("\nInforme Saque após Depósito Inicial: ");
                valor = scanner.nextDouble(); // entrada de valor de saque após depósito
                conta.sacar(valor);
                break;
            } catch (Exception e) {
                System.out.println("Valor de saque inválido!");
                scanner.nextLine();
            }
        }


        // exibição de saldo corrente de conta após operações de depósito e saque
        System.out.println("\nSaldo Final: " + conta.getSaldo());
        scanner.close();
    }
}
