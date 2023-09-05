import java.util.Scanner;

public class Atv490 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; // Tamanho do vetor

        System.out.println("Digite 10 nomes:");

        for (int L = 0; L < 10; L++) {
            System.out.print("Nome " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();
        }

        System.out.print("Digite um nome para contar: ");
        String nomeParaContar = scanner.nextLine();

        int cont = restantes(nomes, 10, nomeParaContar);

        System.out.println("\nResultados:");
        System.out.println("Nome a ser contado: " + nomeParaContar);
        System.out.println("Quantidade de vezes que aparece: " + cont);
    }

    public static int restantes(String[] vet, int tam, String x) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vet[i].equals(x)) {
                vet[i] = ""; // Marque o elemento como vazio para não contar novamente
                cont++;
            }
        }
        return cont;
    }
}
