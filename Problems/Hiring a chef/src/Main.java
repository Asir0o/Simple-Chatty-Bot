import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String cuisinePreference = scanner.nextLine();

        System.out.printf("The form for %s is completed. ", firstName);
        System.out.printf("We will contact you if we need a chef that cooks %s dishes.", cuisinePreference);

    }
}