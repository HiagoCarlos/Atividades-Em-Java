import java.util.Scanner;

public class atv346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int op, x, tam;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nDigite uma frase: ");
                    scanner.nextLine(); // Consume the newline character left by previous nextInt()
                    frase = scanner.nextLine();
                    System.out.println("Número de caracteres da frase: " + frase.length());
                    break;

                case 2:
                    System.out.print("\nDigite uma frase: ");
                    scanner.nextLine();
                    frase = scanner.nextLine();
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    tam = frase.length() - 2;
                    System.out.println("Os dois últimos caracteres: " + frase.substring(tam));
                    break;

                case 3:
                    System.out.print("\nDigite uma frase: ");
                    scanner.nextLine();
                    frase = scanner.nextLine();
                    for (x = frase.length() - 1; x >= 0; x--) {
                        System.out.print(frase.charAt(x));
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nFim do algoritmo");
                    break;

                default:
                    System.out.println("\nOpção não disponível");
                    break;
            }

            System.out.println("\n\n");
        } while (op != 4);
    }
}
