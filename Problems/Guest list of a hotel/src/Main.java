//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest1 = scanner.next();
        String guest2 = scanner.next();
        //scanner.nextLine();
        String guest3 = scanner.next();
        String guest4 = scanner.next();
        String guest5 = scanner.next();
        String guest6 = scanner.next();
        //scanner.nextLine();
        String guest7 = scanner.next();
        String guest8 = scanner.next();
        //scanner.nextLine();


        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                guest8, guest7, guest6, guest5, guest4, guest3, guest2, guest1);
    }
}