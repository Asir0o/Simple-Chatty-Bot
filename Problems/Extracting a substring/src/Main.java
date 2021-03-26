import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(string.substring(beginIndex, endIndex + 1));
    }
}