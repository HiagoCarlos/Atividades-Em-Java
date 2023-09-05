import java.util.Scanner;

public class Atv495 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int L = 0; L < 5; L++) {
            System.out.print("Nome " + (L + 1) + ": ");
            nome[L] = scanner.nextLine();
        }

        ordena(nome, 5);

        System.out.println("\nNOMES ORDENADOS:");

        for (int L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }
    }

    public static void ordena(String[] vet, int tam) {
        String aux;
        for (int Li = 0; Li < tam - 1; Li++) {
            for (int ci = Li + 1; ci < tam; ci++) {
                if (vet[Li].compareTo(vet[ci]) > 0) {
                    aux = vet[Li];
                    vet[Li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}
