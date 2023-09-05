import java.util.Scanner;

public class Atv483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[4];
        int[] num1 = new int[4];

        for (int L = 0; L < 4; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º número do primeiro vetor: ");
            num[L] = scanner.nextInt();
        }

        for (int L = 0; L < 4; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º número do segundo vetor: ");
            num1[L] = scanner.nextInt();
        }

        int c = produtointerno(num, num1, 4);

        System.out.println("\nVETOR A\tVETOR B");
        for (int L = 0; L < 4; L++) {
            System.out.println(num[L] + "\t" + num1[L]);
        }

        System.out.println("\nProduto interno: " + c);
    }

    public static int produtointerno(int[] vet1, int[] vet2, int quant) {
        int prod = 0;
        for (int i = 0; i < quant; i++) {
            prod += (vet1[i] * vet2[i]);
        }
        return prod;
    }
}
