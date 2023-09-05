import java.util.Scanner;

public class Atv493 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10]; // Tamanho do vetor

        System.out.println("Digite 10 números:");

        for (int L = 0; L < 10; L++) {
            System.out.print("Número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        int c = verificaordem(num, 10);

        if (c == 1) {
            System.out.println("\nORDENAÇÃO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("\nNÃO ESTÁ ORDENADO");
        }
    }

    public static int busca(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static int buscal(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static int verificaordem(int[] vetor, int t) {
        int r = busca(vetor, t);

        if (r == 1) {
            return 1;
        } else {
            r = buscal(vetor, t);
            if (r == 1) {
                return 2;
            } else {
                return 0;
            }
        }
    }
}
