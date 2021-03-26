import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int number = 1;

        while (amount > 0) {
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
                amount--;
                if (amount == 0) {
                    break;
                }
            }
            number++;
        }
    }
}