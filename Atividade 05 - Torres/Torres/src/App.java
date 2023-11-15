import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

    public static void torresDeHanoi(int n, char origem, char destino, char auxiliar, long[] movimentos) {
        if (n == 1) {
            movimentos[0]++;
            return;
        }
        torresDeHanoi(n - 1, origem, auxiliar, destino, movimentos);
        movimentos[0]++;
        torresDeHanoi(n - 1, auxiliar, destino, origem, movimentos);
    }

    public static void resolverTorresDeHanoi(int n) {
        long[] movimentos = {0};
        long startTime = System.nanoTime();
        torresDeHanoi(n, 'A', 'C', 'B', movimentos);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        String formattedTime = String.format("%02d:%02d:%02d:%d",
                TimeUnit.NANOSECONDS.toHours(totalTime),
                TimeUnit.NANOSECONDS.toMinutes(totalTime) % 60,
                TimeUnit.NANOSECONDS.toSeconds(totalTime) % 60,
                totalTime % 1000000);
        System.out.println("Tempo gasto: " + formattedTime);
        System.out.println("Quantidade de movimentos: " + movimentos[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de discos: ");
        int n = scanner.nextInt();
        resolverTorresDeHanoi(n);
    }
}
