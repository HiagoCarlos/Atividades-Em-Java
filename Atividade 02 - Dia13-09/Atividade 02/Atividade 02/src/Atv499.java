import java.util.Arrays;
import java.util.Scanner;

public class Atv499 {
    private static final int op = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int flag = 0;

        do {
            System.out.println("\n\n\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    entrada(vetor);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        ordena(vetor);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1.");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        imprime(vetor);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1.");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida.");
                    break;
            }
        } while (op != 4);
    }

    public static void entrada(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrada do VETOR");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprime(int[] vetor) {
        System.out.println("\nVETOR:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ": " + vetor[i]);
        }
    }

    public static void ordena(int[] vetor) {
        Arrays.sort(vetor);
        System.out.println("\nVetor ordenado com sucesso.");
    }
}


