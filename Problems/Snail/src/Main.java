import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(); //Height  of pole
        int a = scanner.nextInt(); //Feet up per day
        int b = scanner.nextInt(); //Feet down per day

        System.out.println(1 + (h - b - 1) / (a - b));
    }
}