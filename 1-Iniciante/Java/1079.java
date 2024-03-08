import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double resultado = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f\n", resultado);;
        }

    }
}
