import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previousNum = scanner.nextInt();
        int currentNum = scanner.nextInt();

        boolean asc = previousNum < currentNum;
        boolean des = previousNum > currentNum;

        while (scanner.hasNext()) {
            if (previousNum > currentNum) {
                des = true;
            } else if (previousNum < currentNum) {
                asc = true;
            }
            previousNum = currentNum;

            currentNum = scanner.nextInt();

            if (currentNum == 0) {
                break;
            }
        }
        System.out.println(des ^ asc);
    }
}