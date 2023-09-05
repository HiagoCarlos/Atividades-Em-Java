import java.util.Scanner;

public class Atv485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        String[] num1 = new String[6];

        for (int L = 0; L < 6; L++) {
            System.out.print("Digite um número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        for (int L = 0; L < 6; L++) {
            System.out.print("Digite um caractere " + (L + 1) + ": ");
            num1[L] = scanner.next();
        }

        System.out.println();
        multivetor(num, num1, 6);
        System.out.println();
    }

    public static void multivetor(int[] vet1, String[] vet2, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println();
            for (int w = 0; w < vet1[i]; w++) {
                System.out.print(vet2[i]);
            }
        }
    }
}
