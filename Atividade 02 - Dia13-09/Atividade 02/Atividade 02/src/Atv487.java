import java.util.Scanner;

public class Atv487 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10; // Defina o tamanho máximo do vetor conforme sua necessidade
        int[] vet = new int[max];

        System.out.println("Digite " + max + " números:");

        for (int L = 0; L < max; L++) {
            System.out.print("Número " + (L + 1) + ": ");
            vet[L] = scanner.nextInt();
        }

        inverte(vet, max);

        System.out.println("\nVETOR invertido:");

        for (int L = 0; L < max; L++) {
            System.out.println((L + 1) + " - " + vet[L]);
        }
    }

    public static void inverte(int[] vet, int max) {
        int k, i, aux;
        k = max;

        for (i = 0; i < max / 2; i++) {
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}
