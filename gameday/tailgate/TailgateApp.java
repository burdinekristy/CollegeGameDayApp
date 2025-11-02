package gameday.tailgate;

import java.util.Scanner;

public class TailgateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TailgateManager manager = new TailgateManager();

        System.out.println("Welcome to Tailgate Planning!");

        System.out.print("Enter tailgate location: ");
        String location = scanner.nextLine();

        System.out.print("Enter tailgate time: ");
        String time = scanner.nextLine();

        manager.createEvent(location, time);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add friend");
            System.out.println("2. Add supply");
            System.out.println("3. View event");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter friend's name: ");
                    String friend = scanner.nextLine();
                    manager.getCurrentEvent().addFriend(friend);
                    break;
                case "2":
                    System.out.print("Enter supply name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    manager.getCurrentEvent().addSupply(new SupplyItem(itemName, quantity));
                    break;
                case "3":
                    System.out.println("\nCurrent Tailgate Event:");
                    System.out.println(manager.getCurrentEvent());
                    break;
                case "4":
                    System.out.println("Exiting Tailgate Planner. Have a great GameDay!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
