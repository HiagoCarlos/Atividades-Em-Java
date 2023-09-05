import java.util.Scanner;

public class atv358 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        double lucro;
        int totLucroMenor10 = 0;
        int totLucroEntre10E20 = 0;
        int totLucroMaior20 = 0;

        for (int A = 0; A < 100; A++) {
            System.out.print("\nPreço de compra da mercadoria " + (A + 1) + ": ");
            precoCompra[A] = scanner.nextDouble();

            System.out.print("Preço de venda da mercadoria " + (A + 1) + ": ");
            precoVenda[A] = scanner.nextDouble();
        }

        for (int A = 0; A < 100; A++) {
            lucro = precoVenda[A] - precoCompra[A];

            if (lucro < 10.0) {
                totLucroMenor10++;
            } else if (lucro <= 20.0) {
                totLucroEntre10E20++;
            } else {
                totLucroMaior20++;
            }
        }

        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroEntre10E20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);
    }
}
