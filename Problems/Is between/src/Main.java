import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        boolean between1 = firstNumber >= secondNumber && firstNumber <= thirdNumber;
        boolean between2 = firstNumber <= secondNumber && firstNumber >= thirdNumber;

        boolean result = between1 || between2;

        System.out.println(result);
    }
}