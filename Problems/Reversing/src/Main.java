import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstNumber = number % 10;
        int secondNumber = number % 100 / 10;
        int thirdNumber = number / 100 % 10;


        System.out.println(firstNumber * 100 + secondNumber * 10 + thirdNumber);

    }
}