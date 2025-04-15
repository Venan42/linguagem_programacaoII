package lista02;

import java.util.Scanner;

public class ArrayUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Questão 3
        int[] array1 = new int[] {2, 4, 6, 8, 10, 12};
        try {
            for(int i = 0; i <= 12; i++){
                System.out.print(array1[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tentativa de acesso de um índice inválido!");
        }

        //Questão 4
        boolean erro = false;
        do {
            System.out.println("Informe o tamanho do array: ");
            int tamanho = scanner.nextInt();
            try {
                int[] array2 = new int[tamanho];

                for(int i = 0; i < array2.length; i++) {
                    System.out.print("Informe o " + (i+1) + "º Número: ");
                    array2[i] = scanner.nextInt();
                }

                for(int i = 0; i < array2.length; i++){
                    System.out.print(array2[i] + " ");
                }    
            } catch (NegativeArraySizeException e) {
                System.out.println("Índice de array inválido!");
                erro = true;
            }
        } while(erro);

    }
}
