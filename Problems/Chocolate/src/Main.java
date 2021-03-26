import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length  = scanner.nextInt();
        int width = scanner.nextInt();
        int numOfSegments  = scanner.nextInt();

        boolean canBreak = numOfSegments % length == 0 || numOfSegments % width == 0;
        boolean checkSize = length * width > numOfSegments || length * width % numOfSegments == 0;

        if (canBreak && checkSize) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}