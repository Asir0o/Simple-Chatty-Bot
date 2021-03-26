import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int delX = Math.abs(x1 - x2);
        int delY = Math.abs(y1 - y2);

        if (delX == delY) {
            System.out.println("YES");
        } else if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}