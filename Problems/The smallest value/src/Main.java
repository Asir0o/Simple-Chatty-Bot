import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long n = 1;
        long factN = n;

        while (factN <= m) {
            factN *= n + 1;
            n++;
        }

        System.out.println(n);
    }
}