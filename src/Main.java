import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String message = "\nEnter the task number: 1 or 2. 0 - closing the program.";
        System.out.println(message);
        isScannerHaveInt(message);
        int taskNumber = scanner.nextInt();

        while (true) {
            switch (taskNumber) {
                case 1 -> task1();
                case 2 -> task2();
                case 0 -> {
                    scanner.close();
                    return;
                }
            }
            System.out.println(message);
            isScannerHaveInt(message);
            taskNumber = scanner.nextInt();
        }
    }

    public static void task1() {
        CreditCard user1 = new CreditCard(1111, 100.5);
        CreditCard user2 = new CreditCard(2222, 50.1);
        CreditCard user3 = new CreditCard(3333, 1000);
        user1.addAmount(500.5);
        user2.addAmount(100);
        user3.takeAmount(999);
        System.out.println(user1.showCardInformation() + user2.showCardInformation() + user3.showCardInformation());
    }

    public static void task2() {
        Computer computer1 = new Computer(2000.5, "ASUS");
        System.out.println(computer1.showComputerInformation());

        Computer computer2 = new Computer(1500, "Dell", new RAM("DDR4", "16 GB"),
                                          new HDD("HP", "14 TB", "Internal") );
        System.out.println(computer2.showComputerInformation());
    }

    public static void isScannerHaveInt(String message) {
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
    }
}

