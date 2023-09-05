import java.util.Scanner;

public class atv351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o número da pessoa: ");
        num = scanner.nextInt();

        while (num < 1 || num > 5) {
            System.out.println("Número fora do intervalo");
            System.out.print("Digite o número da pessoa: ");
            num = scanner.nextInt();
        }

        System.out.println(nomes[num - 1]);

        scanner.close();
    }
}
