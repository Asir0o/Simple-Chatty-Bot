import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int gradD = 0;
        int gradC = 0;
        int gradB = 0;
        int gradA = 0;


        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 2) {
                gradD++;
            } else if (num == 3) {
                gradC++;
            } else if (num == 4) {
                gradB++;
            } else if (num == 5) {
                gradA++;
            }
        }
        System.out.printf("%d %d %d %d", gradD, gradC, gradB, gradA);
    }
}