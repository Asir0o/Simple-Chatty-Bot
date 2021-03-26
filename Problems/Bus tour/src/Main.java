import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight) {
                System.out.printf("Will crash on bridge %d", i);
                break;
            } else if (i == numberOfBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}