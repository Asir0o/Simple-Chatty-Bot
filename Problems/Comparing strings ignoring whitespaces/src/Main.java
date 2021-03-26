import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String firstNonSpaceString =  firstString.replace(" ", "");
        String secondNonSpaceString = secondString.replace(" ", "");

        System.out.println(firstNonSpaceString.equals(secondNonSpaceString));
    }
}