import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        int result = scanner.nextInt();
        int year = 0;

        while (result > money) {
            money += (money * percent) / 100;
            year++;
        }

        System.out.println(year);
    }
}