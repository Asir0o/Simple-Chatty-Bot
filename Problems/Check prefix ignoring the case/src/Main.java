import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String stringUpperCase = string.toUpperCase();

        boolean startWithJ = stringUpperCase.charAt(0) == 'J';

        System.out.println(startWithJ);
    }
}