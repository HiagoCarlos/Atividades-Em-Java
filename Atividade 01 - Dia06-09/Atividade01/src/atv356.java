import java.util.Scanner;

public class atv356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            while (nomes[i].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres.");
                System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }

            int t = 30 - nomes[i].length();
            for (int c = 1; c <= t; c++) {
                nomes[i] += " ";
            }

            System.out.print("Digite a nota da PR1: ");
            pr1[i] = scanner.nextDouble();
            System.out.print("Digite a nota da PR2: ");
            pr2[i] = scanner.nextDouble();

            media[i] = (int) Math.round((pr1[i] + pr2[i]) / 2);

            if (media[i] >= 5) {
                sit[i] = "AP";
            } else {
                sit[i] = "RP";
            }
        }

        System.out.println("\n\n\t\t\tRELACAO FINAL");
        System.out.println("Num\tNome\t\t\tPR1\tPR2\tMedia\tSituacao");

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + "\t" + nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + media[i] + "\t" + sit[i]);
        }
    }
}
