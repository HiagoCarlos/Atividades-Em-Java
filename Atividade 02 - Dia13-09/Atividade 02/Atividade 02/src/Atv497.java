import java.util.Scanner;

public class Atv497 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10]; // Tamanho do vetor
        int n; // Chave de busca

        System.out.println("Digite 10 números (ordenados):");

        for (int L = 0; L < 10; L++) {
            System.out.print("Número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        System.out.print("Digite o número de busca: ");
        n = scanner.nextInt();

        int posicao = busca(num, 10, n);

        System.out.println("\nVETOR:");

        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }

        if (posicao != -1) {
            System.out.println("\nEncontrado na posição: " + (posicao + 1));
        } else {
            System.out.println("\nNão encontrado.");
        }
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;

            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1;
    }
}
