import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cupsOfReese = scanner.nextInt(); //Reese's peanut butter cups
        boolean isWeekend = scanner.nextBoolean(); //Representing whether it is the weekend

        boolean notWeekend = cupsOfReese >= 10 && cupsOfReese <= 20 && !isWeekend;
        boolean weekend = cupsOfReese >= 15 && cupsOfReese <= 25 && isWeekend;

        boolean successfulParty = notWeekend ^ weekend;

        System.out.println(successfulParty);
    }
}